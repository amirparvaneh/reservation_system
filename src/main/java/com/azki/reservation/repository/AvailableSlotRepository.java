package com.azki.reservation.repository;

import com.azki.reservation.model.AvailableSlots;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface AvailableSlotRepository extends JpaRepository<AvailableSlots,Long>,
        JpaSpecificationExecutor<AvailableSlots> {

    AvailableSlots findAvailableSlotsByIsReservedFalseOrderByStartTimeDesc();

}
