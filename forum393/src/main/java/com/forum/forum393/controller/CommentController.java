package com.forum.forum393.controller;

import com.forum.forum393.model.Comment;
import com.forum.forum393.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class CommentController {
    @Autowired
    CommentService commentService;
    
    @GetMapping("/{question-id}/comments")
    public List<Comment> getCommentsByQuestionId(@PathVariable("question-id") int id){
        return commentService.getByInstructorId(id);
    }

    @GetMapping("/{question-id}/comments/{comment-id}")
    public Comment getCommentsByQuestionId(@PathVariable("question-id") int instructorId, @PathVariable("comment-id") int courseId){
        return commentService.getByInstructorIdAndCourseId(instructorId, courseId);
    }
}
