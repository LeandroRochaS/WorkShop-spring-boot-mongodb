package com.projeto.workshop.demo.entities;

import com.projeto.workshop.demo.dto.AuthorDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Post {
    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDTO Author;

    public Post() {
    }

    public Post(String id, Date date, String title, String body, AuthorDTO Author) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.Author = Author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post post)) return false;

        if (getId() != null ? !getId().equals(post.getId()) : post.getId() != null) return false;
        if (getDate() != null ? !getDate().equals(post.getDate()) : post.getDate() != null) return false;
        if (getTitle() != null ? !getTitle().equals(post.getTitle()) : post.getTitle() != null) return false;
        return getBody() != null ? getBody().equals(post.getBody()) : post.getBody() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getBody() != null ? getBody().hashCode() : 0);
        return result;
    }

    public AuthorDTO getAuthor() {
        return Author;
    }

    public void setAuthor(AuthorDTO author) {
        Author = author;
    }
}
