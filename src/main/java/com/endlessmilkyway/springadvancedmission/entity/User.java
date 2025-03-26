package com.endlessmilkyway.springadvancedmission.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User {

    @NotEmpty(message = "아이디는 공백일 수 없습니다!")
    @Size(min = 6, message = "아이디는 6글자 이상 입력해야 합니다!")
    private String id;

    @NotNull(message = "비밀번호 값이 제대로 들어오지 않았습니다!")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[!@#$%^&*()-+=]).{10,20}$", message = "비밀번호 형식이 올바르지 않습니다! 8자리 이상, 대소문자 포함, 숫자 및 특수문자 포함(!@#%^&*()-+=)")
    private String pw;

    @NotNull(message = "이름값이 제대로 들어오지 않았습니다!")
    @Pattern(regexp = "^[가-힣]+$", message = "이름은 한글만 입력 가능합니다!")
    private String name;

    @NotNull(message = "전화번호 값이 제대로 들어오지 않았습니다!")
    @Pattern(regexp = "^01(?:0|1|[6-9])-\\d{3,4}-\\d{4}$", message = "전화번호 형식이 올바르지 않습니다!")
    private String phone;

    @NotBlank(message = "이메일 값이 제대로 들어오지 않았습니다!")
    @Email(message = "이메일 형식이 올바르지 않습니다!")
    private String email;
}
