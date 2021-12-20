package com.forum.forum393.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "T_ANSWER")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "t_answer_answer",
            joinColumns = @JoinColumn(name = "answer_id", referencedColumnName = "answer_id"))
    private List<Comment> answer = new ArrayList<>();

    public List<Comment> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Comment> answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}