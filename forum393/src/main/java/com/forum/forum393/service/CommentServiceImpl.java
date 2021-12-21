package com.forum.forum393.service;

import com.forum.forum393.model.Comment;
import com.forum.forum393.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepo commentRepo;


    @Override
    public Comment save(Comment comment) {
        return null;
    }

    public void deleteCommentById(Integer id){
        commentRepo.deleteCommentById(id);
    }
    public void deleteCommentWithQuestionId(Integer question_id){
        commentRepo.deleteCommentWithQuestionQuestionId(question_id);

    }
    public void deleteCommentWithAnswerId(Integer answer_id){
        commentRepo.deleteCommentWithQuestionAnswerId(answer_id);

    }
/*
    @Override
    public List<Comment> getByInstructorId(int id) {
        return null;
    }

    @Override
    public Comment getByInstructorIdAndCourseId(int instructorId, int courseId) {
        return null;
    } */
}
