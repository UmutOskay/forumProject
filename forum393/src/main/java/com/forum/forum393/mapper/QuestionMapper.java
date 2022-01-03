package com.forum.forum393.mapper;


import com.forum.forum393.dto.QuestionDTO;
import com.forum.forum393.model.Question;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@Mapper
public interface QuestionMapper {

    QuestionMapper INSTANCE = Mappers.getMapper( QuestionMapper.class );
    @Mapping(source = "title", target = "title")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "tags", target = "tags")
    @Mapping(source = "askedDate", target = "askedDate")
    @Mapping(source = "user", target = "askedBy")
    @Mapping(source = "answerCount", target = "answerCount")
    @Mapping(source = "voteCount", target = "voteCount")
    QuestionDTO questionToQuestionDTO(Question q);

    @Mapping(source = "title", target = "title")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "tags", target = "tags")
    @Mapping(source = "askedDate", target = "askedDate")
    @Mapping(source = "user", target = "askedBy")
    @Mapping(source = "answerCount", target = "answerCount")
    @Mapping(source = "voteCount", target = "voteCount")
    List<QuestionDTO> questionListToQuestionDTOList(List<Question> q);

    @Mapping(source = "title", target = "title")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "tags", target = "tags")
    @Mapping(source = "askedDate", target = "askedDate")
    @Mapping(source = "askedBy", target = "user")
    @Mapping(source = "answerCount", target = "answerCount")
    @Mapping(source = "voteCount", target = "voteCount")
    Question questionDTOtoQuestion(QuestionDTO questionDTO);
}

