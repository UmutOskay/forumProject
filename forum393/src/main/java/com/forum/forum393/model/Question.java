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
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;
    private String askedDate;
    private int viewCount;
    private String description;
    @Column(name = "answerCount")
    private int answerCount;
    @Column(name = "voteCount")
    private int voteCount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public int getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @OneToMany(mappedBy = "question",cascade = CascadeType.ALL)
  //  @JoinColumn(name = "answers_id")
    private List<Answer> answers = new ArrayList<>();


    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
 //   @JoinColumn(name = "comments_id")
    private List<Comment> comments = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "rel_question_tag",
            joinColumns = @JoinColumn(name = "question_id",
                    referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id",
                    referencedColumnName = "id"))
    private List<Tag> tags = new ArrayList<Tag>();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
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



    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
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


    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}