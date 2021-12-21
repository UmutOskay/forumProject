package com.forum.forum393.controller;

import com.forum.forum393.model.Answer;
import com.forum.forum393.model.Comment;
import com.forum.forum393.model.Question;
import com.forum.forum393.service.AnswerService;
import com.forum.forum393.service.CommentService;
import com.forum.forum393.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @Autowired
    AnswerService answerService;

    @Autowired
    CommentService commentService;

    @GetMapping
    public List<Question> getAll(){

        return questionService.getAll();
    }

    @GetMapping("/{question-id}")
    public Question getQuestionById(@PathVariable("question-id") int id){

        return questionService.getById(id);
    }
    @GetMapping("/{question-id}/answers")
    public List<Answer> getAnswersByQuestionId(@PathVariable("question-id") int id){
        return answerService.getByQuestionId(id);
    }

    @GetMapping("/{question-id}/comments")
    public List<Comment> getCommentsByQuestionId(@PathVariable("question-id") int id){
        return commentService.getByInstructorId(id);
    }

    @GetMapping("/{question-id}/comments/{comment-id}")
    public Comment getCommentsByQuestionId(@PathVariable("question-id") int instructorId, @PathVariable("comment-id") int courseId){
        return commentService.getByInstructorIdAndCourseId(instructorId, courseId);
    }

    @GetMapping("/{question-id}/answers/{answer-id}")
    public Comment getAnswersByQuestionId(@PathVariable("question-id") int instructorId, @PathVariable("answer-id") int courseId){
        return answerService.getByInstructorIdAndCourseId(instructorId, courseId);
    }

    @DeleteMapping("/{question-id}")
    public void deleteById(@PathVariable("question-id") int id){
        questionService.deleteById(id);
    }

    @PostMapping
    public Question saveQuestion(@RequestBody Question data){

        return questionService.save(data);
    }
}
