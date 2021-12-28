package com.forum.forum393.mapper;

import com.forum.forum393.dto.CommentDTO;
import com.forum.forum393.model.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CommentMapper {
    CommentMapper INSTANCE = Mappers.getMapper( CommentMapper.class );
    @Mapping(source = "id", target = "id")
    @Mapping(source = "text", target = "text")
    @Mapping(source = "writer", target = "writer")
    @Mapping(source = "date", target = "date")
    @Mapping(source = "question", target = "question")
    @Mapping(source = "answer", target = "answer")
    @Mapping(source = "user", target = "user")
    CommentDTO commentToCommentDTO(Comment comment);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "text", target = "text")
    @Mapping(source = "writer", target = "writer")
    @Mapping(source = "date", target = "date")
    @Mapping(source = "question", target = "question")
    @Mapping(source = "answer", target = "answer")
    @Mapping(source = "user", target = "user")
    List<CommentDTO> commentListToCommentDTOList(List<Comment> comment);


}
