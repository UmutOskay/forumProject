package com.forum.forum393.controller;

import com.forum.forum393.dto.AnswerDTO;
import com.forum.forum393.dto.CommentDTO;
import com.forum.forum393.dto.QuestionDTO;
import com.forum.forum393.model.Answer;
import com.forum.forum393.model.Comment;
import com.forum.forum393.model.Question;
import com.forum.forum393.model.Tag;
import com.forum.forum393.service.AnswerService;
import com.forum.forum393.service.CommentService;
import com.forum.forum393.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions") // questionın commentleri answer ın commentleri sadece
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @Autowired
    AnswerService answerService;

    @Autowired
    CommentService commentService;



    @GetMapping
    public List<QuestionDTO> getAll(){

        return questionService.getAll();
    }

    @GetMapping("/{question-id}/comments")
    public List<CommentDTO> getAllComments(@PathVariable ("question-id") int id){

        return commentService.getByQuestionId(id);
    }

    @GetMapping("/{question-id}/answers")
    public List<AnswerDTO> getAllAnswers(@PathVariable ("question-id") int id){

        return answerService.getByQuestionId(id);
    }

    @GetMapping("/{question-id}")
    public QuestionDTO getQuestionById(@PathVariable("question-id") int id){

        return questionService.getById(id);
    }



    @GetMapping("/{question-id}/answers/{answer-id}")
    public AnswerDTO getAnswersByQuestionId(@PathVariable("question-id") int questionId, @PathVariable("answer-id") int answerId){
        return answerService.getByQuestionIdAndAnswerId(questionId, answerId);
    }


    @GetMapping("/{question-id}/comments/{comment-id}")
    public CommentDTO getCommentsByQuestionId(@PathVariable("question-id") int questionId, @PathVariable("comment-id") int commentId){
        return commentService.getByQuestionIdAndCommentId(questionId, commentId);
    }

    @DeleteMapping("/{question-id}")
    public void deleteById(@PathVariable("question-id") int id){
        questionService.deleteById(id);
    }

    @PostMapping
    public QuestionDTO saveQuestion(@RequestBody QuestionDTO data){

        return questionService.save(data);
    }
}