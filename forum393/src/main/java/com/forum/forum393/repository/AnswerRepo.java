package com.forum.forum393.repository;

import com.forum.forum393.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepo extends JpaRepository<Answer, Integer> {
    void deleteAnswerById(Integer answer_id);

    Answer getByQuestionIdAndAnswerId(int questionId, int answerId);

    List<Answer> getByAnswerId(int id);
}
