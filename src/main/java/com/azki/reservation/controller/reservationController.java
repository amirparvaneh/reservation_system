package com.azki.reservation.controller;


import com.azki.reservation.Service.ReservationService;
import com.azki.reservation.dto.response.ReservationResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/reservations")
@RequiredArgsConstructor
public class reservationController {

    private final ReservationService reservationService;


    @PostMapping(value = "/booking")
    public ResponseEntity<ReservationResponseDto> booking(@RequestHeader(value = "user_id") Long userId){
        return ResponseEntity.ok(reservationService.bookingClosest(userId));
    }

    @DeleteMapping(value = "/{userName}/{reservationId}")
    public ResponseEntity<String> cancelReservationById(@PathVariable String reservationId){

    }
}
