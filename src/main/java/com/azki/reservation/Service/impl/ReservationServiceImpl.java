package com.azki.reservation.Service.impl;

import com.azki.reservation.Service.AvailableSlotService;
import com.azki.reservation.Service.ReservationService;
import com.azki.reservation.Service.UserService;
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
    private final UserService userService;
    private final AvailableSlotService availableSlotService;

    @Override
    public ReservationResponseDto bookingClosest(Long userId) {
        userService.findUserById(userId);
        availableSlotService.findFirstSlotToBooking();

    }

    @Override
    public String cancelReservation(String userName, Long reservationId) {
        return null;
    }
}
