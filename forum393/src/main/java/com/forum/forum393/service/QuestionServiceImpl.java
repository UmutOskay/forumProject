package com.forum.forum393.service;

import com.forum.forum393.dto.QuestionDTO;
import com.forum.forum393.mapper.QuestionMapper;
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
    public QuestionDTO save(QuestionDTO questionDTO) {

        Question q = QuestionMapper.INSTANCE.questionDTOtoQuestion(questionDTO);
        questionRepo.save(q);
        questionDTO.setId(q.getId());
        return questionDTO;
    }

    public List<QuestionDTO> getAll() {
        List<Question> questions = questionRepo.findAll();
        List<QuestionDTO> qDtoList;
        qDtoList = QuestionMapper.INSTANCE.questionListToQuestionDTOList(questions);
        return qDtoList;
    }

    public QuestionDTO getById(int id) {

        Question q = questionRepo.getById(id);


        QuestionDTO qDto;
        qDto = QuestionMapper.INSTANCE.questionToQuestionDTO(q);
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