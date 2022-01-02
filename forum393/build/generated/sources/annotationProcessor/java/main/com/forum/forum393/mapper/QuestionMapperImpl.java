package com.forum.forum393.mapper;

import com.forum.forum393.dto.QuestionDTO;
import com.forum.forum393.dto.UserDTO;
import com.forum.forum393.model.Question;
import com.forum.forum393.model.Tag;
import com.forum.forum393.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-02T03:28:36+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.3.1.jar, environment: Java 11.0.13 (Oracle Corporation)"
)
public class QuestionMapperImpl implements QuestionMapper {

    @Override
    public QuestionDTO questionToQuestionDTO(Question q) {
        if ( q == null ) {
            return null;
        }

        QuestionDTO questionDTO = new QuestionDTO();

        questionDTO.setTitle( q.getTitle() );
        questionDTO.setDescription( q.getDescription() );
        List<Tag> list = q.getTags();
        if ( list != null ) {
            questionDTO.setTags( new ArrayList<Tag>( list ) );
        }
        questionDTO.setAskedDate( q.getAskedDate() );
        questionDTO.setAskedBy( userToUserDTO( q.getUser() ) );
        questionDTO.setAnswerCount( q.getAnswerCount() );
        questionDTO.setVoteCount( q.getVoteCount() );
        questionDTO.setId( q.getId() );

        return questionDTO;
    }

    @Override
    public List<QuestionDTO> questionListToQuestionDTOList(List<Question> q) {
        if ( q == null ) {
            return null;
        }

        List<QuestionDTO> list = new ArrayList<QuestionDTO>( q.size() );
        for ( Question question : q ) {
            list.add( questionToQuestionDTO( question ) );
        }

        return list;
    }

    @Override
    public Question questionDTOtoQuestion(QuestionDTO questionDTO) {
        if ( questionDTO == null ) {
            return null;
        }

        Question question = new Question();

        question.setTitle( questionDTO.getTitle() );
        question.setDescription( questionDTO.getDescription() );
        List<Tag> list = questionDTO.getTags();
        if ( list != null ) {
            question.setTags( new ArrayList<Tag>( list ) );
        }
        question.setAskedDate( questionDTO.getAskedDate() );
        question.setUser( userDTOToUser( questionDTO.getAskedBy() ) );
        question.setAnswerCount( questionDTO.getAnswerCount() );
        question.setVoteCount( questionDTO.getVoteCount() );
        question.setId( questionDTO.getId() );

        return question;
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
