package com.endlessmilkyway.springadvancedmission.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import java.time.LocalDate;
import java.util.Date;

public class PostDto {

    @NotBlank(message = "제목은 공백일 수 없습니다!")
    private String title;

    @NotBlank(message = "저자는 공백일 수 없습니다!")
    private String author;

    @NotNull(message = "작성일은 null일 수 없습니다!")
    @PastOrPresent
    private LocalDate created;

    @NotNull(message = "본문 내용은 null일 수 없습니다!")
    private String content;

    public PostDto() {
    }

    public PostDto(String title, String author, LocalDate created, String content) {
        this.title = title;
        this.author = author;
        this.created = created;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "PostDto{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", created=" + created +
                ", content='" + content + '\'' +
                '}';
    }
}
