package com.azki.reservation.Service.impl;

import com.azki.reservation.Service.ReservationService;
import com.azki.reservation.dto.response.ReservationResponseDto;
import com.azki.reservation.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository repository;

    @Override
    public ReservationResponseDto bookingClosest(Long userId) {
        return null;
    }

    @Override
    public String cancelReservation(Long userId, Long reservationId) {
        return null;
    }
}
