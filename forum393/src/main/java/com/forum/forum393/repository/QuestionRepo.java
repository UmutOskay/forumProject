package com.forum.forum393.repository;

import com.forum.forum393.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {
    void deleteQuestionById(Integer question_id);
}
