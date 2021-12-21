package com.forum.forum393.controller;

import com.forum.forum393.model.Answer;
import com.forum.forum393.model.Comment;
import com.forum.forum393.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class AnswerController {
    @Autowired
    AnswerService answerService;

    @GetMapping("/{question-id}/answers")
    public Answer getAnswersByQuestionId(@PathVariable("question-id") int id){
        return answerService.getByAnswerId(id);
    }
   /* @GetMapping("/{question-id}/answers/{answer-id}")
    public Comment getAnswersByQuestionId(@PathVariable("question-id") int instructorId, @PathVariable("answer-id") int courseId){
        return answerService.getByInstructorIdAndCourseId(instructorId, courseId);
    } */
}
