package com.forum.forum393.service;

import com.forum.forum393.dto.QuestionDTO;
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
        return questionRepo.save(question);
    }




    public List<Question> getAll() {
        return questionRepo.findAll();
    }


    public QuestionDTO getById(int id) {
        Question q = questionRepo.getById(id);
        QuestionDTO qDto = new QuestionDTO();
        qDto.setId(q.getId());
        qDto.setTitle(q.getTitle());
        qDto.setDescription(q.getDescription());
        return qDto;
    }


    public void deleteQuestionById(int question_id) {
        questionRepo.deleteQuestionById(question_id);
    }

    @Override
    public void deleteById(int id) {
        questionRepo.deleteById(id);
    }


}