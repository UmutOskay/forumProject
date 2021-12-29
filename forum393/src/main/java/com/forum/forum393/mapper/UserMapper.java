package com.forum.forum393.mapper;

import com.forum.forum393.dto.QuestionDTO;
import com.forum.forum393.dto.UserDTO;
import com.forum.forum393.model.Question;
import com.forum.forum393.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    UserDTO userToUserDTO(User user);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    User userDTOToUser(UserDTO userDTO);
}
