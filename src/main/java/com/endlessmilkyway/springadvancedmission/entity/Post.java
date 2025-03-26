package com.endlessmilkyway.springadvancedmission.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Date;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Post {

    @NotBlank(message = "제목은 공백일 수 없습니다!")
    private String title;

    @NotBlank(message = "저자는 공백일 수 없습니다!")
    private String author;

    @NotNull(message = "작성일은 null일 수 없습니다!")
    private Date created;

    private String content;
}
