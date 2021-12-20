package com.forum.forum393.service;

import com.forum.forum393.model.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Override
    public Comment save(Comment comment) {
        return null;
    }

    @Override
    public List<Comment> getByInstructorId(int id) {
        return null;
    }

    @Override
    public Comment getByInstructorIdAndCourseId(int instructorId, int courseId) {
        return null;
    }
}
