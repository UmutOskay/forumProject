package com.forum.forum393.controller;

import com.forum.forum393.model.Comment;
import com.forum.forum393.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @GetMapping("/{question-id}/comments")
    public List<Comment> getCommentsByQuestionId(@PathVariable("question-id") int id){
        return commentService.getByQuestionId(id);
    }

    @GetMapping("/{question-id}/comments/{comment-id}")
    public Comment getCommentsByQuestionId(@PathVariable("question-id") int questionId, @PathVariable("comment-id") int commentId){
        return commentService.getByQuestionIdAndCommentId(questionId, commentId);
    }
}