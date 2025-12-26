package com.azki.reservation.service;

import com.azki.reservation.dto.response.ReservationResponseDto;

public interface ReservationService {

    ReservationResponseDto bookingClosest(Long userId);

    String cancelReservation(String userName, Long reservationId);
}
