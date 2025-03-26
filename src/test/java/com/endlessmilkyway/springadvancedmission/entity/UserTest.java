package com.endlessmilkyway.springadvancedmission.entity;

import static org.assertj.core.api.Assertions.assertThat;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserTest {

    Validator validator;

    @BeforeEach
    public void setupValidatorInstance() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @DisplayName("아이디가 Null이면 검증에 실패한다.")
    @Test
    void exceptionOccurredWhenIsIdNull() {
        User user = new User(null, "@As12345678", "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        violations.forEach(violation -> System.out.println(violation.getMessage()));

        // @NotEmpty 미준수
        assertThat(violations.size()).isEqualTo(1);
    }

    @DisplayName("아이디가 공백이면 검증에 실패한다.")
    @Test
    void exceptionOccurredWhenIsIdBlank() {
        User user = new User(" ", "@As12345678", "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        violations.forEach(violation -> System.out.println(violation.getMessage()));

        // @NotEmpty 미준수
        assertThat(violations.size()).isEqualTo(1);
    }

    @DisplayName("아이디 길이가 6미만이면 검증에 실패한다.")
    @Test
    void exceptionOccurredWhenIdLengthLessThanSix() {
        User user = new User("test1", "@As12345678", "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        violations.forEach(violation -> System.out.println(violation.getMessage()));

        // @Size 미준수
        assertThat(violations.size()).isEqualTo(1);
    }
}