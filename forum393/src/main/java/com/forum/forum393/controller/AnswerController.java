package com.forum.forum393.controller;

import com.forum.forum393.dto.AnswerDTO;
import com.forum.forum393.dto.CommentDTO;
import com.forum.forum393.model.Answer;
import com.forum.forum393.model.Comment;
import com.forum.forum393.model.Question;
import com.forum.forum393.repository.AnswerRepo;
import com.forum.forum393.repository.QuestionRepo;
import com.forum.forum393.service.AnswerService;
import com.forum.forum393.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@RequestMapping("/answers")
//@RequestMapping("/api")
public class AnswerController {
    @Autowired
    AnswerService answerService;

    @Autowired
    CommentService commentService;

    @Autowired
    AnswerRepo answerRepo;

   /* @GetMapping
    public List<AnswerDTO> getAll(){

        return answerService.getAll();
    }*/ //gerek yok

/*
    @PostMapping
    public AnswerDTO saveAnswer(@RequestBody AnswerDTO data){
        return answerService.save(data);
    }
*/
    @PostMapping({"/{answer-id}/comments"})
    public CommentDTO saveAnswer(@RequestBody CommentDTO data, @PathVariable("answer-id") int answerId ){
        data.setAnswer(answerRepo.getById(answerId));
        return commentService.saveCommentByAnswerId(data,answerId);
    }



}