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
        return commentRepo.save(comment);
    }

    public void deleteCommentById(Integer id) {
        commentRepo.deleteCommentById(id);
    }

    public void deleteCommentWithQuestionId(Integer question_id) {
        commentRepo.deleteCommentWithQuestionQuestionId(question_id);

    }

    public void deleteCommentWithAnswerId(Integer answer_id) {
        commentRepo.deleteCommentWithQuestionAnswerId(answer_id);

    }

    @Override
    public List<Comment> getByQuestionId(int id) {

        return commentRepo.getByQuestionId(id);
    }

    @Override
    public Comment getByQuestionIdAndCommentId(int questionId, int commentId) {
        return commentRepo.getByQuestionIdAndCommentId(questionId,commentId);
    }
}
