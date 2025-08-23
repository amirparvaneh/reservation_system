package com.azki.reservation.Service.impl;

import com.azki.reservation.Service.AvailableSlotService;
import com.azki.reservation.Service.ReservationService;
import com.azki.reservation.Service.UserService;
import com.azki.reservation.dto.response.ReservationResponseDto;
import com.azki.reservation.mapper.ReservationMapper;
import com.azki.reservation.model.AvailableSlots;
import com.azki.reservation.model.Reservations;
import com.azki.reservation.model.User;
import com.azki.reservation.model.enums.ReservationStatus;
import com.azki.reservation.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;
    private final UserService userService;
    private final AvailableSlotService availableSlotService;
    private final ReservationMapper reservationMapper;

    @Override
    public ReservationResponseDto bookingClosest(Long userId) {
        User applicants = userService.findUserById(userId);
        AvailableSlots firstSlotToBooking = availableSlotService.findFirstSlotToBooking();
        Reservations reservedTime = Reservations.builder()
                .reservationTime(firstSlotToBooking.getStartTime())
                .user(applicants)
                .status(ReservationStatus.CONFIRMED)
                .build();
        availableSlotService.changeToReserved(firstSlotToBooking);
        Reservations booked = reservationRepository.save(reservedTime);
        return reservationMapper.reservationToDTO(booked);
    }

    @Override
    public String cancelReservation(String userName, Long reservationId) {
        return null;
    }
}
