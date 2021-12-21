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


    @GetMapping
    public List<Question> getAll(){

        return questionService.getAll();
    }

    @GetMapping("/{question-id}")
    public Question getQuestionById(@PathVariable("question-id") int id){

        return questionService.getById(id);
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
