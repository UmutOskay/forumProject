package com.forum.forum393.service;

import com.forum.forum393.model.Question;

import java.util.List;

public interface QuestionService {
    public Question save(Question question);
    List<Question> getAll();
    Question getById(int id);

    void deleteQuestionById(int question_id);
}
