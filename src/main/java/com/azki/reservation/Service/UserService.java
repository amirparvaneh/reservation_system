package com.azki.reservation.Service;

import com.azki.reservation.dto.UserResponseDto;
import com.azki.reservation.model.User;

import java.util.List;

public interface UserService {
    List<UserResponseDto> fetchAllUsers();
    User findUserById(Long userId);
}
