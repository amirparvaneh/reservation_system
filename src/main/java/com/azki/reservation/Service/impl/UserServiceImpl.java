package com.azki.reservation.Service.impl;


import com.azki.reservation.Service.UserService;
import com.azki.reservation.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public List<User> fetchAllUsers() {
        return null;
    }
}
