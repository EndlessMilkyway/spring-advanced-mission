package com.endlessmilkyway.springadvancedmission.entity;

import java.util.Date;

public class Post {

    public Post() {
    }

    public Post(String title, String author, Date created, String content) {
        this.title = title;
        this.author = author;
        this.created = created;
        this.content = content;
    }

    private Long id;

    private String title;

    private String author;

    private Date created;

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
        return "Post{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", created=" + created +
                ", content='" + content + '\'' +
                '}';
    }
}
