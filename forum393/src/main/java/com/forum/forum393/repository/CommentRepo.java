package com.forum.forum393.repository;

import com.forum.forum393.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Integer> {
    @Modifying
    @Query("delete from Comment c where c.answer.question.id = ?1")
    @Transactional
    void deleteCommentWithQuestionQuestionId(Integer question_id);

    void deleteCommentWithQuestionAnswerId(Integer answer_id);

    void deleteCommentById(Integer id);
}
