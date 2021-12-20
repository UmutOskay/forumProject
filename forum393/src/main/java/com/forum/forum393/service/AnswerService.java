package com.forum.forum393.service;

import com.forum.forum393.model.Answer;
import com.forum.forum393.model.Comment;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AnswerService {
    public Answer save(Answer answer);
    List<Answer> getByQuestionId(int id);

    Comment getByInstructorIdAndCourseId(int instructorId, int courseId);
}
