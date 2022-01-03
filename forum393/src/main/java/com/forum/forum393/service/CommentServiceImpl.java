package com.forum.forum393.service;

import com.forum.forum393.dto.AnswerDTO;
import com.forum.forum393.dto.CommentDTO;
import com.forum.forum393.dto.QuestionDTO;
import com.forum.forum393.mapper.AnswerMapper;
import com.forum.forum393.mapper.CommentMapper;
import com.forum.forum393.mapper.QuestionMapper;
import com.forum.forum393.model.Answer;
import com.forum.forum393.model.Comment;
import com.forum.forum393.model.Question;
import com.forum.forum393.repository.AnswerRepo;
import com.forum.forum393.repository.CommentRepo;
import com.forum.forum393.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepo commentRepo;
    @Autowired
    QuestionRepo questionRepo;
    @Autowired
    AnswerRepo answerRepo;

    @Override
    public Comment save(Comment comment) {
        return commentRepo.save(comment);
    }

    @Override
    public List<CommentDTO> getByQuestionId(int id) {

        List<Comment> comments = commentRepo.getByQuestionId(id);
        List<CommentDTO> commentDTOList;
        commentDTOList = CommentMapper.INSTANCE.commentListToCommentDTOList(comments);
        return commentDTOList;
    }

    @Override
    public CommentDTO getByQuestionIdAndCommentId(int questionId, int commentId) {
        Comment c = commentRepo.getByQuestionIdAndCommentId(questionId,commentId);
        CommentDTO commentDTO;
        commentDTO = CommentMapper.INSTANCE.commentToCommentDTO(c);
        return commentDTO;
    }

    @Override
    public List<CommentDTO> getAll() {
        List<Comment> comments = commentRepo.findAll();
        List<CommentDTO> commentDTOList;
        commentDTOList = CommentMapper.INSTANCE.commentListToCommentDTOList(comments);
        return commentDTOList;
    }

    @Override
    public void deleteById(int id) {
        commentRepo.deleteById(id);
    }

    @Override
    public CommentDTO saveCommentByQuestionId(CommentDTO data, int questionId) {
        Comment c = CommentMapper.INSTANCE.commentDTOToComment(data);
        commentRepo.save(c);
        data.setId(c.getId());
        return data;
    }

    @Override
    public CommentDTO saveCommentByAnswerId(CommentDTO data, int answerId) {
        Comment c = CommentMapper.INSTANCE.commentDTOToComment(data);
        commentRepo.save(c);
        data.setId(c.getId());
        data.setAnswer(answerRepo.getById(answerId));
        return data;
    }

    @Override
    public void deleteComment(Comment comment, int id) {
        commentRepo.delete(comment);
    }
}
/*
    public void deleteCommentById(Integer id) {
        commentRepo.deleteCommentById(id);
    }

    public void deleteCommentWithQuestionId(Integer question_id) {
        commentRepo.deleteCommentWithQuestionQuestionId(question_id);

    }

    public void deleteCommentWithAnswerId(Integer answer_id) {
        commentRepo.deleteCommentWithQuestionAnswerId(answer_id);

    }



    */

