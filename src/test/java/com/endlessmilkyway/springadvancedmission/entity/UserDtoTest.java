package com.endlessmilkyway.springadvancedmission.entity;

import static org.assertj.core.api.Assertions.assertThat;

import com.endlessmilkyway.springadvancedmission.dto.UserDto;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserDtoTest {

    Validator validator;

    @BeforeEach
    public void setupValidatorInstance() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @DisplayName("아이디가 Null이면 검증에 실패한다.")
    @Test
    void validFailOccurredWhenIsIdNull() {
        UserDto userDto = new UserDto(null, "@As12345678", "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);

        printViolations(violations);

        // @NotEmpty 미준수
        checkViolationCount(violations);
    }

    @DisplayName("아이디가 공백이면 검증에 실패한다.")
    @Test
    void validFailOccurredWhenIsIdBlank() {
        UserDto userDto = new UserDto(" ", "@As12345678", "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);

        printViolations(violations);

        // @NotEmpty 미준수
        checkViolationCount(violations);
    }

    @DisplayName("아이디 길이가 6미만이면 검증에 실패한다.")
    @Test
    void validFailOccurredWhenIdLengthLessThanSix() {
        UserDto userDto = new UserDto("test1", "@As12345678", "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);

        printViolations(violations);

        // @Size 미준수
        checkViolationCount(violations);
    }

    @DisplayName("비밀번호가 null이면 검증에 실패한다.")
    @Test
    void validFailOccurredWhenPasswordIsNull() {
        UserDto userDto = new UserDto("test01", null, "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("비밀번호가 공백이면 검증에 실패한다.")
    @Test
    void validFailOccurredWhenPasswordIsBlank() {
        UserDto userDto = new UserDto("test01", " ", "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("비밀번호 작성 규칙을 지키지 않았을 경우 검증에 실패한다.")
    @Test
    void validFailOccurredWhenPasswordDoesNotFollowRule() {
        UserDto userDto = new UserDto("test01", "asdfqwer1234", "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("비밀번호 길이가 10미만이면 검증에 실패한다.")
    @Test
    void validFailOccurredWhenPasswordLengthLessThanTen() {
        UserDto userDto = new UserDto("test01", "@1Asd123", "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("비밀번호 길이가 20초과이면 검증에 실패한다.")
    @Test
    void validFailOccurredWhenPasswordLengthMoreThanTwenty() {
        UserDto userDto = new UserDto("test01", "@Asdfqwer12345678!#987", "김철수", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("이름이 null인 경우 검증에 실패한다.")
    @Test
    void validFailOccurredWhenNameIsNull() {
        UserDto userDto = new UserDto("test01", "@As12345678", null, "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("이름이 공백인 경우 검증에 실패한다.")
    @Test
    void validFailOccurredWhenNameIsBlank() {
        UserDto userDto = new UserDto("test01", "@As12345678", " ", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("이름이 한글이 아닐 경우 검증에 실패한다.")
    @Test
    void exceptionOccurredWhenNameIsNotKorean() {
        UserDto userDto = new UserDto("test01", "@As12345678", "John Doe", "010-1234-5678", "kcs0123@gmail.com");
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("전화번호가 null일 경우 검증에 실패한다.")
    @Test
    void validFailOccurredWhenPhoneNumberIsNull() {
        UserDto userDto = new UserDto("test01", "@As12345678", "김철수", null, "kcs0123@gmail.com");
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("전화번호가 공백일 경우 검증에 실패한다.")
    @Test
    void validFailOccurredWhenPhoneNumberIsBlank() {
        UserDto userDto = new UserDto("test01", "@As12345678", "김철수", " ", "kcs0123@gmail.com");
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("전화번호 형식을 준수하지 않을 경우 검증에 실패한다.")
    @Test
    void validFailOccurredWhenPhoneNumberDoesNotFollowRule() {
        UserDto userDto = new UserDto("test01", "@As12345678", "김철수", "asdfqwerty", "kcs0123@gmail.com");
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("이메일이 null일 경우 검증에 실패한다.")
    @Test
    void validFailOccurredWhenEmailIsNull() {
        UserDto userDto = new UserDto("test01", "@As12345678", "김철수", "010-1234-5678", null);
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("이메일이 공백일 경우 검증에 실패한다.")
    @Test
    void validFailOccurredWhenEmailIsBlank() {
        UserDto userDto = new UserDto("test01", "@As12345678", "김철수", "010-1234-5678", "");
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    @DisplayName("이메일 형식을 준수하지 않을 경우 검증에 실패한다.")
    @Test
    void validFailOccurredWhenEmailDoesNotFollowRule() {
        UserDto userDto = new UserDto("test01", "@As12345678", "김철수", "010-1234-5678", "asdfqwerty");
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);

        printViolations(violations);

        // @NotBlank 미준수
        checkViolationCount(violations);
    }

    private void printViolations(Set<ConstraintViolation<UserDto>> violations) {
        violations.forEach(violation -> System.out.println(violation.getMessage()));
    }

    private void checkViolationCount(Set<ConstraintViolation<UserDto>> violations) {
        assertThat(violations.size()).isEqualTo(1);
    }
}