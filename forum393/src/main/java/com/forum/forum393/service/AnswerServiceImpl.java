package com.forum.forum393.service;

import com.forum.forum393.dto.AnswerDTO;
import com.forum.forum393.dto.QuestionDTO;
import com.forum.forum393.mapper.AnswerMapper;
import com.forum.forum393.mapper.QuestionMapper;
import com.forum.forum393.model.Answer;
import com.forum.forum393.model.Comment;
import com.forum.forum393.model.Question;
import com.forum.forum393.repository.AnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService{
    @Autowired
    AnswerRepo answerRepo;
    @Override
    public AnswerDTO save(AnswerDTO answerDTO) {
       // return answerRepo.save(answer);
        Answer a = AnswerMapper.INSTANCE.answerDTOToAnswer(answerDTO);
        answerRepo.save(a);
        answerDTO.setId(a.getId());
        return answerDTO;
    }

    @Override
    public List<Answer> getByQuestionId(int id) {

        return answerRepo.getByQuestionId(id);
    }

    @Override
    public List<AnswerDTO> getAll() {
        List<Answer> answers = answerRepo.findAll();
        List<AnswerDTO> answersDtoList;
        answersDtoList = AnswerMapper.INSTANCE.answerListToAnswerDTOList(answers);
        return answersDtoList;
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