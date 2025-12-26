package com.azki.reservation.service;

import com.azki.reservation.dto.request.LoginRequest;
import com.azki.reservation.dto.request.RegisterRequest;
import com.azki.reservation.dto.response.AuthResponse;

public interface AuthenticationService {

    AuthResponse login(LoginRequest loginRequest);

    void register(RegisterRequest registerRequest);
}
