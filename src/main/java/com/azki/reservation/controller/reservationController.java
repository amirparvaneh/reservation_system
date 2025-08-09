package com.azki.reservation.controller;


import com.azki.reservation.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/reservations")
@RequiredArgsConstructor
public class reservationController {



    @PostMapping(value = "/booking")
    public ResponseEntity<UserResponseDto> booking(@RequestHeader(value = "user_id") Long userId){

    }
}
