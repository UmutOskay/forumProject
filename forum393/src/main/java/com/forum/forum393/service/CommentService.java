package com.forum.forum393.service;

import com.forum.forum393.model.Comment;

import java.util.List;

public interface CommentService {
    public Comment save(Comment comment);

    List<Comment> getByInstructorId(int id);

    Comment getByInstructorIdAndCourseId(int instructorId, int courseId);
}
