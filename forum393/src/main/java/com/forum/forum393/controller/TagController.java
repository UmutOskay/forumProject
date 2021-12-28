package com.forum.forum393.controller;

import com.forum.forum393.model.Question;
import com.forum.forum393.model.Tag;
import com.forum.forum393.service.QuestionService;
import com.forum.forum393.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
@RestController
@RequestMapping("/tags")
public class TagController {

    @Autowired
    TagService tagService;

    @Autowired
    QuestionService questionService;


    @GetMapping("/{tag-id}/questions")
    public List<Question> getQuestionsByTagId(@PathVariable("tag-id") int id) {
        return tagService.getByTagId(id);
    }


}*/
