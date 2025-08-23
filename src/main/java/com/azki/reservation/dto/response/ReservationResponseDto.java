package com.azki.reservation.dto.response;


import com.azki.reservation.model.enums.ReservationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReservationResponseDto implements Serializable {

    private LocalDateTime reservationTime;
    private ReservationStatus reservationStatus;
    private String email;

}
