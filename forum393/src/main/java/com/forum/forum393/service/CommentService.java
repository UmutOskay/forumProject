package com.forum.forum393.service;

import com.forum.forum393.dto.CommentDTO;
import com.forum.forum393.model.Comment;
import com.forum.forum393.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface CommentService {


    public Comment save(Comment comment);
    List<Comment> getByQuestionId(int id);
    Comment getByQuestionIdAndCommentId(int questionId, int commentId);

    List<CommentDTO> getAll();

    void deleteById(int id);
/*
    void deleteCommentById(Integer id);
    void deleteCommentWithQuestionId(Integer question_id);
    void deleteCommentWithAnswerId(Integer answer_id);



    */
}
