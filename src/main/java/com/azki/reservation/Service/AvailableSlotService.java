package com.azki.reservation.Service;

import com.azki.reservation.model.AvailableSlots;

public interface AvailableSlotService {

    AvailableSlots findFirstSlotToBooking();
}
