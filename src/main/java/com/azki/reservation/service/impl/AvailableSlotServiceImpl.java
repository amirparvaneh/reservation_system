package com.azki.reservation.service.impl;

import com.azki.reservation.service.AvailableSlotService;
import com.azki.reservation.model.AvailableSlots;
import com.azki.reservation.repository.AvailableSlotRepository;
import jakarta.persistence.LockModeType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
@RequiredArgsConstructor
public class AvailableSlotServiceImpl implements AvailableSlotService {

    private final AvailableSlotRepository repository;

    @Override
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    public AvailableSlots findFirstSlotToBooking() {
        return repository.findAvailableSlotsByIsReservedFalseOrderByStartTimeDesc();
    }

    @Override
    public List<AvailableSlots> findAllAvailableSlot() {
        return repository.findAllByIsReservedFalse();
    }

    @Override
    public void changeToReserved(AvailableSlots availableSlots) {
        availableSlots.setIsReserved(Boolean.TRUE);
        repository.save(availableSlots);
    }
}
