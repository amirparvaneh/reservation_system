package com.azki.reservation.controller;


import com.azki.reservation.service.ReservationService;
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
    public ResponseEntity<ReservationResponseDto> booking(@RequestHeader(value = "userId") Long userId) {
        return ResponseEntity.ok(reservationService.bookingClosest(userId));
    }

    @DeleteMapping(value = "/{userName}/{reservationId}")
    public ResponseEntity<String> cancelReservationById(@PathVariable String userName,
                                                        @PathVariable Long reservationId) {
        return ResponseEntity.ok(reservationService.cancelReservation(userName, reservationId));
    }
}
