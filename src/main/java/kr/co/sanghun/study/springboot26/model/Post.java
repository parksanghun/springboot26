package kr.co.sanghun.study.springboot26.model;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

public class Post {

    private Integer id;
    @NotEmpty(message = "{post.title.notEmpty}")
    private String title;
    private String desc;
    private LocalDateTime dateCreated;

    public Post(Integer id, String title, String desc, LocalDateTime dateTime) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.dateCreated = dateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
