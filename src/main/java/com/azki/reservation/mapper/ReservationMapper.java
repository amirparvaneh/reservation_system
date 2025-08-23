package com.azki.reservation.mapper;


import com.azki.reservation.dto.response.ReservationResponseDto;
import com.azki.reservation.model.Reservations;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ReservationMapper {

    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);

    @Mapping(target = "email",source = "user.email")
    ReservationResponseDto reservationToDTO(Reservations reservations);
}
