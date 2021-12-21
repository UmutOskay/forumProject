package com.forum.forum393.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "T_COMMENT")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    private String text;
    private String writer;
    private String date;

   /* @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id")
    private Question question; */
   @OneToMany(mappedBy = "comment", cascade = CascadeType.ALL)
   private List<Question> questions = new ArrayList<Question>();

    @OneToMany(mappedBy = "comment",cascade = CascadeType.ALL)
    private List<Answer> answers = new ArrayList<Answer>();
   /* @ManyToMany(mappedBy = "answer", cascade = CascadeType.ALL)
    private List<Answer> answers = new ArrayList<>(); */

    /*public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    } */

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}