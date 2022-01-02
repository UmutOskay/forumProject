package com.forum.forum393.dto;

import com.forum.forum393.model.Comment;
import com.forum.forum393.model.Question;

import java.util.List;

public class AnswerDTO {

    private int id;
    private int voteCount;
    private UserDTO user;
    private String text;
   /* private Question question;
    private List<Comment> comments;*/

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

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

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO userDTO) {
        this.user = userDTO;
    }
/*
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
    }*/


}
