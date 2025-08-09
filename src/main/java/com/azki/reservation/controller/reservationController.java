package com.azki.reservation.controller;


import com.azki.reservation.dto.ReservationOutputDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/reservations")
public class reservationController {


    @PostMapping(value = "/booking")
    public ResponseEntity<ReservationOutputDto> booking(@RequestHeader(value = "user_id") Long userId){

    }
}
