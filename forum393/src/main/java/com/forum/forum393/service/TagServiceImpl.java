package com.forum.forum393.service;

import com.forum.forum393.model.Question;
import com.forum.forum393.model.Tag;
import com.forum.forum393.repository.TagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService{
  /*  @Autowired
    TagRepo tagRepo;

    @Override
    public List<Question> getByTagId(int id) {
        return tagRepo.getByTagId(id);
    }

    @Override
    public void save(Tag tag) {
        tagRepo.save(tag);
    }*/
}
