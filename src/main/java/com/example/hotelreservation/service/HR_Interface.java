package com.example.hotelreservation.service;

import com.example.hotelreservation.dto.HR_Add_DTO;
import com.example.hotelreservation.model.HR_Entity;

import java.util.List;

public interface HR_Interface {
     void addHotel(HR_Add_DTO hrAddDto);

     List<HR_Entity> getAllHotels();

     HR_Entity getHotelsById(Long id);

     void deleteHotelsById(Long id);
}
