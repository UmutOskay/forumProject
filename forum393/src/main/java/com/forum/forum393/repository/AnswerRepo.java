package com.forum.forum393.repository;

import com.forum.forum393.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepo extends JpaRepository<Answer, Integer> {
    void deleteAnswerById(Integer answer_id);

    @Query("select a from Answer a inner join a.question i where i.id=?1 and a.id=?2")
    Answer getByQuestionIdAndAnswerId(int questionId, int answerId);

    List<Answer> getByQuestionId(int id);

    //   List<Answer> getByAnswerId(int id);
}
