package com.example.hotelreservation.service;
import com.example.hotelreservation.dto.HR_Add_DTO;
import com.example.hotelreservation.model.HR_Entity;
import java.util.Set;
public interface HR_Interface {
     HR_Entity addHotel(HR_Add_DTO hrAddDto);
     Set<HR_Entity> getAllHotels();
     HR_Entity getHotelsById(Long id);
     void deleteHotelsById(Long id);
}