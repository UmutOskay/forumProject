package com.forum.forum393.service;

import com.forum.forum393.model.Question;
import com.forum.forum393.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    @Override
    public Question save(Question question) {
        return null;
    }


    public List<Question> getAll() {
        return null;
    }


    public Question getById(int id) {
        return null;
    }


    public void deleteQuestionById(int question_id) {
        questionRepo.deleteQuestionById(question_id);
    }


}