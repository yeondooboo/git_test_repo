package data;

import java.time.LocalDateTime;

public class Article {
    private int id;
    private String title;
    private String body;
    private String author;
    private LocalDateTime regDate;
    private LocalDateTime updataDate;

    public Article(int id, String title, String body, String author){
        this.id = id;
        this.title = title;
        this.body = body;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public LocalDateTime getUpdataDate() {
        return updataDate;
    }

    public void setUpdataDate(LocalDateTime updataDate) {
        this.updataDate = updataDate;
    }
}
