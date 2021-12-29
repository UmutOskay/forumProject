package com.forum.forum393.service;

import com.forum.forum393.dto.AnswerDTO;
import com.forum.forum393.model.Answer;
import com.forum.forum393.model.Comment;
import com.forum.forum393.repository.AnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AnswerService {

    AnswerDTO save(AnswerDTO answer);
    List<Answer> getByAnswerId(int id);
    void deleteAnswerById(Integer answer_id);
    AnswerDTO getByQuestionIdAndAnswerId(int questionId,int answerId);


    List<AnswerDTO> getByQuestionId(int id);

    List<AnswerDTO> getAll();
}