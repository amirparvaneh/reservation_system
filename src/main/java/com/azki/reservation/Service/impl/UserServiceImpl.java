package com.azki.reservation.Service.impl;


import com.azki.reservation.Service.UserService;
import com.azki.reservation.dto.UserResponseDto;
import com.azki.reservation.model.User;
import com.azki.reservation.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserResponseDto> fetchAllUsers() {
        List<User> allUser = userRepository.findAll();
        return null;
    }
}
