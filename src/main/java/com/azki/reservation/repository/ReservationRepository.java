package com.azki.reservation.repository;


import com.azki.reservation.model.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservations,Long>, JpaSpecificationExecutor<Reservations> {
}
