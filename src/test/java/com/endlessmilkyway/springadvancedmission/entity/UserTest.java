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

        printViolations(violations);

        // @NotEmpty 미준수
        checkViolationCount(violations);
    }

    @DisplayName("아이디가 공백이면 검증에 실패한다.")
    @Test
    void exceptionOccurredWhenIsIdBlank() {
        User user = new User(" ", "@As12345678", "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        printViolations(violations);

        // @NotEmpty 미준수
        checkViolationCount(violations);
    }

    @DisplayName("아이디 길이가 6미만이면 검증에 실패한다.")
    @Test
    void exceptionOccurredWhenIdLengthLessThanSix() {
        User user = new User("test1", "@As12345678", "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        printViolations(violations);

        // @Size 미준수
        checkViolationCount(violations);
    }

    @DisplayName("비밀번호가 null이면 검증에 실패한다.")
    @Test
    void exceptionOccurredWhenPasswordIsNull() {
        User user = new User("test01", null, "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("비밀번호가 공백이면 검증에 실패한다.")
    @Test
    void exceptionOccurredWhenPasswordIsBlank() {
        User user = new User("test01", " ", "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("비밀번호 작성 규칙을 지키지 않았을 경우 검증에 실패한다.")
    @Test
    void exceptionOccurredWhenPasswordDoesNotFollowRule() {
        User user = new User("test01", "asdfqwer1234", "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("비밀번호 길이가 10미만이면 검증에 실패한다.")
    @Test
    void exceptionOccurredWhenPasswordLengthLessThanTen() {
        User user = new User("test01", "@1Asd123", "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("비밀번호 길이가 20초과이면 검증에 실패한다.")
    @Test
    void exceptionOccurredWhenPasswordLengthMoreThanTwenty() {
        User user = new User("test01", "@Asdfqwer12345678!#987", "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("이름이 null인 경우 검증에 실패한다.")
    void exceptionOccurredWhenNameIsNull() {
        User user = new User("test01", "@As12345678", null, "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("이름이 공백인 경우 검증에 실패한다.")
    @Test
    void exceptionOccurredWhenNameIsBlank() {
        User user = new User("test01", "@As12345678", " ", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("이름이 한글이 아닐 경우 검증에 실패한다.")
    @Test
    void exceptionOccurredWhenNameIsNotKorean() {
        User user = new User("test01", "@As12345678", "John Doe", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    private void printViolations(Set<ConstraintViolation<User>> violations) {
        violations.forEach(violation -> System.out.println(violation.getMessage()));
    }

    private void checkViolationCount(Set<ConstraintViolation<User>> violations) {
        assertThat(violations.size()).isEqualTo(1);
    }
}