package com.forum.forum393.dto;

import com.forum.forum393.model.Answer;
import com.forum.forum393.model.Question;
import com.forum.forum393.model.User;


public class CommentDTO {

    private int id;
    private String text;
    private UserDTO writer;
    private String date;
    //  private Question question;
    //private Answer answer;
    //private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public UserDTO getWriter() {
        return writer;
    }

    public void setWriter(UserDTO writer) {
        this.writer = writer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

   /* public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/
}
