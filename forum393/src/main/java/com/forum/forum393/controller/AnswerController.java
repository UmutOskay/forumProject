package com.forum.forum393.controller;

import com.forum.forum393.model.Answer;
import com.forum.forum393.model.Comment;
import com.forum.forum393.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/answers")
public class AnswerController {
    @Autowired
    AnswerService answerService;




}