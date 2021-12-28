package com.forum.forum393.mapper;

import com.forum.forum393.dto.AnswerDTO;
import com.forum.forum393.model.Answer;
import com.forum.forum393.model.Comment;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-28T20:17:55+0300",
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
        answerDTO.setUser( answer.getUser() );
        answerDTO.setQuestion( answer.getQuestion() );
        List<Comment> list = answer.getComments();
        if ( list != null ) {
            answerDTO.setComments( new ArrayList<Comment>( list ) );
        }

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
}
