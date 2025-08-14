package com.azki.reservation.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AvailableSlotMapper {

    AvailableSlotMapper INSTANCE = Mappers.getMapper(AvailableSlotMapper.class);


}
