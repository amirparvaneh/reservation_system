package com.azki.reservation.Service;

import com.azki.reservation.dto.UserResponseDto;

import java.util.List;

public interface UserService {
    List<UserResponseDto> fetchAllUsers();
}
