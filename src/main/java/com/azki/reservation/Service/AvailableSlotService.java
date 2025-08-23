package com.azki.reservation.Service;

import com.azki.reservation.model.AvailableSlots;

import java.util.List;

public interface AvailableSlotService {

    AvailableSlots findFirstSlotToBooking();

    List<AvailableSlots> findAllAvailableSlot();

    void changeToReserved(AvailableSlots availableSlots);
}
