package com.azki.reservation.mapper;


import com.azki.reservation.dto.UserResponseDto;
import com.azki.reservation.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    List<UserResponseDto> userListToResponseDtoList(List<User> users);
}
