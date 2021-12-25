package com.forum.forum393.service;

import com.forum.forum393.model.Answer;
import com.forum.forum393.model.Comment;
import com.forum.forum393.repository.AnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService{
    @Autowired
    AnswerRepo answerRepo;
    @Override
    public Answer save(Answer answer) {
        return answerRepo.save(answer);
    }

    @Override
    public List<Answer> getByQuestionId(int id) {

        return answerRepo.getByQuestionId(id);
    }

    @Override
    public List<Answer> getByAnswerId(int id) {
      return null;
        //  return answerRepo.getByAnswerId(id);
      /*  AnswerDTO dto = fgbfdg;
        list.foreach((item) -> {
            dto.question = item.ques
        })*/
        }



    @Override
    public void deleteAnswerById(Integer answer_id) {
        answerRepo.deleteAnswerById(answer_id);
    }

   @Override
    public Answer getByQuestionIdAndAnswerId(int questionId, int answerId) {
        return answerRepo.getByQuestionIdAndAnswerId(questionId,answerId);
    }


}