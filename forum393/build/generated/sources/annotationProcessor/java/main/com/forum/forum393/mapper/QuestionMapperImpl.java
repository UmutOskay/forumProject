package com.forum.forum393.mapper;

import com.forum.forum393.dto.QuestionDTO;
import com.forum.forum393.model.Question;
import com.forum.forum393.model.Tag;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-28T20:17:55+0300",
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
        questionDTO.setAskedBy( q.getOwner() );
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
}
