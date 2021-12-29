package com.forum.forum393.mapper;

import com.forum.forum393.dto.AnswerDTO;
import com.forum.forum393.model.Answer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AnswerMapper {
    AnswerMapper INSTANCE = Mappers.getMapper( AnswerMapper.class );
    @Mapping(source = "id", target = "id")
    @Mapping(source = "voteCount", target = "voteCount")
  //  @Mapping(source = "user", target = "user")
  //  @Mapping(source = "question", target = "question")
  //  @Mapping(source = "comments", target = "comments")
    AnswerDTO answerToAnswerDTO(Answer answer);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "voteCount", target = "voteCount")
   // @Mapping(source = "user", target = "user")
   // @Mapping(source = "question", target = "question")
   // @Mapping(source = "comments", target = "comments")
    List<AnswerDTO> answerListToAnswerDTOList(List<Answer> answer);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "voteCount", target = "voteCount")
    Answer answerDTOToAnswer(AnswerDTO answerDTO);
}
