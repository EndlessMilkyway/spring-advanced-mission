package com.endlessmilkyway.springadvancedmission.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

public class PostDto {

    public PostDto() {
    }

    public PostDto(String title, String author, Date created, String content) {
        this.title = title;
        this.author = author;
        this.created = created;
        this.content = content;
    }

    @NotBlank(message = "제목은 공백일 수 없습니다!")
    private String title;

    @NotBlank(message = "저자는 공백일 수 없습니다!")
    private String author;

    @NotNull(message = "작성일은 null일 수 없습니다!")
    private Date created;

    @NotNull(message = "본문 내용은 null일 수 없습니다!")
    private String content;

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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
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
