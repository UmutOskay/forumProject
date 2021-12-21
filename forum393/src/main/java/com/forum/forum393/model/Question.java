package com.forum.forum393.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "T_QUESTION")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    private String title;
    private String tag;
    private String owner;
    private String askedDate;
    private int viewCount;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @OneToMany(mappedBy = "question",cascade = CascadeType.ALL)
    private List<Answer> answers = new ArrayList<>();


    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Comment> comment = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "rel_question_tag",
            joinColumns = @JoinColumn(name = "question_id",
                    referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id",
                    referencedColumnName = "id"))
    private List<Tag> tags = new ArrayList<Tag>();

    public String getTitle() {
        return title;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }



    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAskedDate() {
        return askedDate;
    }

    public void setAskedDate(String askedDate) {
        this.askedDate = askedDate;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }


    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}