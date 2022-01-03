package com.forum.forum393.mapper;

import com.forum.forum393.dto.CommentDTO;
import com.forum.forum393.dto.UserDTO;
import com.forum.forum393.model.Comment;
import com.forum.forum393.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-03T03:36:34+0300",
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
        commentDTO.setWriter( userToUserDTO( comment.getWriter() ) );
        commentDTO.setQuestion( comment.getQuestion() );
        commentDTO.setAnswer( comment.getAnswer() );

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

    @Override
    public Comment commentDTOToComment(CommentDTO commentDTO) {
        if ( commentDTO == null ) {
            return null;
        }

        Comment comment = new Comment();

        comment.setId( commentDTO.getId() );
        comment.setText( commentDTO.getText() );
        comment.setDate( commentDTO.getDate() );
        comment.setAnswer( commentDTO.getAnswer() );
        comment.setQuestion( commentDTO.getQuestion() );
        comment.setWriter( userDTOToUser( commentDTO.getWriter() ) );

        return comment;
    }

    protected UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        userDTO.setName( user.getName() );

        return userDTO;
    }

    protected User userDTOToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDTO.getId() );
        user.setName( userDTO.getName() );

        return user;
    }
}
