package com.forum.forum393.controller;

import com.forum.forum393.dto.CommentDTO;
import com.forum.forum393.model.Answer;
import com.forum.forum393.model.Comment;
import com.forum.forum393.model.Question;
import com.forum.forum393.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    CommentService commentService;

   /* @GetMapping
    public List<CommentDTO> getAll(){

        return commentService.getAll();
    }*/ // gerek yok

    @DeleteMapping("/{comment-id}")
    public void deleteById(@PathVariable("comment-id") int id){
        commentService.deleteById(id);
    }



    @PostMapping
    public Comment saveComment(@RequestBody Comment data){
        return commentService.save(data);
    }
}