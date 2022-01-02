package com.forum.forum393.mapper;

import com.forum.forum393.dto.AnswerDTO;
import com.forum.forum393.dto.UserDTO;
import com.forum.forum393.model.Answer;
import com.forum.forum393.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-02T03:31:44+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.3.1.jar, environment: Java 11.0.13 (Oracle Corporation)"
)
public class AnswerMapperImpl implements AnswerMapper {

    @Override
    public AnswerDTO answerToAnswerDTO(Answer answer) {
        if ( answer == null ) {
            return null;
        }

        AnswerDTO answerDTO = new AnswerDTO();

        answerDTO.setId( answer.getId() );
        answerDTO.setVoteCount( answer.getVoteCount() );
        answerDTO.setText( answer.getText() );
        answerDTO.setUser( userToUserDTO( answer.getUser() ) );

        return answerDTO;
    }

    @Override
    public List<AnswerDTO> answerListToAnswerDTOList(List<Answer> answer) {
        if ( answer == null ) {
            return null;
        }

        List<AnswerDTO> list = new ArrayList<AnswerDTO>( answer.size() );
        for ( Answer answer1 : answer ) {
            list.add( answerToAnswerDTO( answer1 ) );
        }

        return list;
    }

    @Override
    public Answer answerDTOToAnswer(AnswerDTO answerDTO) {
        if ( answerDTO == null ) {
            return null;
        }

        Answer answer = new Answer();

        answer.setId( answerDTO.getId() );
        answer.setText( answerDTO.getText() );
        answer.setVoteCount( answerDTO.getVoteCount() );
        answer.setUser( userDTOToUser( answerDTO.getUser() ) );

        return answer;
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
