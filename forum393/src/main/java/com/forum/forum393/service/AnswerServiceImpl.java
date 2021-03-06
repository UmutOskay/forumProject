package com.forum.forum393.service;

import com.forum.forum393.dto.AnswerDTO;
import com.forum.forum393.mapper.AnswerMapper;
import com.forum.forum393.model.Answer;
import com.forum.forum393.repository.AnswerRepo;
import com.forum.forum393.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    AnswerRepo answerRepo;
    @Autowired
    QuestionRepo questionRepo;

    @Override
    public AnswerDTO save(AnswerDTO answerDTO) {
        // return answerRepo.save(answer);
        Answer a = AnswerMapper.INSTANCE.answerDTOToAnswer(answerDTO);
        answerRepo.save(a);
        answerDTO.setId(a.getId());
        return answerDTO;
    }

    @Override
    public AnswerDTO saveAnswerByQuestionId(AnswerDTO answerDTO, int questionId) {
        Answer a = AnswerMapper.INSTANCE.answerDTOToAnswer(answerDTO);
        answerRepo.save(a);
        answerDTO.setId(a.getId());
        return answerDTO;
    }

    @Override
    public List<AnswerDTO> getByQuestionId(int id) {

        List<Answer> answers = answerRepo.getByQuestionId(id);
        List<AnswerDTO> answersDTOList;
        answersDTOList = AnswerMapper.INSTANCE.answerListToAnswerDTOList(answers);
        return answersDTOList;
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

    }


    @Override
    public void deleteAnswerById(Integer answer_id) {
        answerRepo.deleteAnswerById(answer_id);
    }

    @Override
    public AnswerDTO getByQuestionIdAndAnswerId(int questionId, int answerId) {
        Answer a = answerRepo.getByQuestionIdAndAnswerId(questionId, answerId);
        AnswerDTO answerDTO;
        answerDTO = AnswerMapper.INSTANCE.answerToAnswerDTO(a);

        return answerDTO;
    }


}