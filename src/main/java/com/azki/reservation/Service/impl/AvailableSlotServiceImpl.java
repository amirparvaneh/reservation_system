package com.azki.reservation.Service.impl;

import com.azki.reservation.Service.AvailableSlotService;
import com.azki.reservation.model.AvailableSlots;
import com.azki.reservation.repository.AvailableSlotRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class AvailableSlotServiceImpl implements AvailableSlotService {

    private final AvailableSlotRepository repository;

    @Override
    public AvailableSlots findFirstSlotToBooking() {
        return repository.findAvailableSlotsByIsReservedFalseOrderByStartTimeDesc();
    }
}
