package com.endlessmilkyway.springadvancedmission.entity;

import java.time.LocalDate;
import java.util.Date;

public class Post {

    private Long id;
    private String title;
    private String author;
    private LocalDate created;
    private String content;

    protected Post() {
    }

    public Post(String title, String author, LocalDate created, String content) {
        this.title = title;
        this.author = author;
        this.created = created;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "Post{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", created=" + created +
                ", content='" + content + '\'' +
                '}';
    }
}
