package com.forum.forum393.controller;

import com.forum.forum393.dto.AnswerDTO;
import com.forum.forum393.model.Answer;
import com.forum.forum393.model.Comment;
import com.forum.forum393.model.Question;
import com.forum.forum393.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answers")
public class AnswerController {
    @Autowired
    AnswerService answerService;

   /* @GetMapping
    public List<AnswerDTO> getAll(){

        return answerService.getAll();
    }*/ //gerek yok


    @PostMapping
    public AnswerDTO saveAnswer(@RequestBody AnswerDTO data){
        return answerService.save(data);
    }


}