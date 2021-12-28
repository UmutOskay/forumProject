package com.forum.forum393.repository;

import com.forum.forum393.model.Question;
import com.forum.forum393.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepo extends JpaRepository<Tag, Integer> {
  //  List<Question> getByTagId(int id);
}