package com.azki.reservation.dto.response;


import com.azki.reservation.model.enums.ReservationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReservationResponseDto implements Serializable {

    private ReservationStatus reservationStatus;

}
