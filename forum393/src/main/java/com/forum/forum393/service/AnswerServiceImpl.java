package com.forum.forum393.service;

import com.forum.forum393.model.Answer;
import com.forum.forum393.model.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService{
    @Override
    public Answer save(Answer answer) {
        return null;
    }

    @Override
    public List<Answer> getByQuestionId(int id) {
        return null;
        /*AnswerDTO dto = fgbfdg;
        list.foreach((item) -> {
            dto.question = item.ques
        })*/
    }

    @Override
    public Comment getByInstructorIdAndCourseId(int instructorId, int courseId) {
        return null;
    }
}
