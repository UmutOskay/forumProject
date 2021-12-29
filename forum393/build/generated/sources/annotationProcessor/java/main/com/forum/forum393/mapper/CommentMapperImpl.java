package com.forum.forum393.mapper;

import com.forum.forum393.dto.CommentDTO;
import com.forum.forum393.model.Comment;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-29T21:00:37+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.3.1.jar, environment: Java 11.0.13 (Oracle Corporation)"
)
public class CommentMapperImpl implements CommentMapper {

    @Override
    public CommentDTO commentToCommentDTO(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentDTO commentDTO = new CommentDTO();

        commentDTO.setId( comment.getId() );
        commentDTO.setText( comment.getText() );
        commentDTO.setDate( comment.getDate() );
        commentDTO.setWriter( comment.getWriter() );
        commentDTO.setQuestion( comment.getQuestion() );
        commentDTO.setAnswer( comment.getAnswer() );
        commentDTO.setUser( comment.getUser() );

        return commentDTO;
    }

    @Override
    public List<CommentDTO> commentListToCommentDTOList(List<Comment> comment) {
        if ( comment == null ) {
            return null;
        }

        List<CommentDTO> list = new ArrayList<CommentDTO>( comment.size() );
        for ( Comment comment1 : comment ) {
            list.add( commentToCommentDTO( comment1 ) );
        }

        return list;
    }
}
