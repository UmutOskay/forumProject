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

   /* @OneToMany(mappedBy = "question",cascade = CascadeType.ALL)
    private List<Comment> comments = new ArrayList<>();*/

   /* @OneToMany(mappedBy = "question",cascade = CascadeType.ALL)
    private List<Answer> answers = new ArrayList<>();*/
    @ManyToOne
    private Answer answer;
    @ManyToOne
    private Comment comment;

    @ManyToMany
    @JoinTable(name = "rel_question_tag",
            joinColumns = @JoinColumn(name = "tag_id",
                    referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "question_id",
                    referencedColumnName = "id"))
    private List<Tag> tags = new ArrayList<Tag>();

    public String getTitle() {
        return title;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /*public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    } */

    /*public String getTags() {
        return tags;
    } */

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

   /* public void setTags(String tags) {
        this.tags = tags;
    } */

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

   /* public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    } */

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
/* public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}