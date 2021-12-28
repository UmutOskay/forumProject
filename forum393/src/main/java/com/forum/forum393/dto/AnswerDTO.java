package com.forum.forum393.dto;

import com.forum.forum393.model.Comment;
import com.forum.forum393.model.Question;
import com.forum.forum393.model.User;

import java.util.List;

public class AnswerDTO {

    private int id;
    private int voteCount;
    private User user;
    private Question question;
    private List<Comment> comments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
