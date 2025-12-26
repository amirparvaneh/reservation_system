package com.azki.reservation.service.impl;


import com.azki.reservation.service.UserService;
import com.azki.reservation.dto.UserResponseDto;
import com.azki.reservation.exceptions.ResourceNotFoundException;
import com.azki.reservation.mapper.UserMapper;
import com.azki.reservation.model.User;
import com.azki.reservation.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService , UserDetailsService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserResponseDto> fetchAllUsers() {
        List<User> allUser = userRepository.findAll();
        return userMapper.userListToResponseDtoList(allUser);
    }

    @Override
    public User findUserById(Long userId) {
        return userRepository.findById(userId).orElseThrow(() ->
                new ResourceNotFoundException("not founded user"));
    }

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {

        return userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException("User not found"));
    }
}
