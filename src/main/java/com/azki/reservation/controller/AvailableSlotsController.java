package com.azki.reservation.controller;


import com.azki.reservation.Service.AvailableSlotService;
import com.azki.reservation.model.AvailableSlots;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/available-slots")
@RequiredArgsConstructor
public class AvailableSlotsController {

    private final AvailableSlotService availableSlotService;


    @GetMapping("/all")
    public ResponseEntity<List<AvailableSlots>> findAll(){
        return ResponseEntity.ok(availableSlotService.findAllAvailableSlot());
    }

}
