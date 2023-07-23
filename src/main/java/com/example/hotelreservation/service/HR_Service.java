package com.example.hotelreservation.service;

import com.example.hotelreservation.dto.HR_Add_DTO;
import com.example.hotelreservation.dto.HR_DTO;
import com.example.hotelreservation.model.HR_Entity;
import com.example.hotelreservation.repository.HR_Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class HR_Service implements HR_Interface{
    private final HR_Repository hrRepository;

    public HR_Service(HR_Repository hrRepository) {
        this.hrRepository = hrRepository;
    }

    @Override
    public void addHotel(HR_Add_DTO hrAddDto) {
        final HR_Entity hrEntity;
        hrEntity = hrRepository.save(new HR_Entity(hrAddDto.getName(),
                hrAddDto.getLocation(), hrAddDto.getStar()));
        HR_DTO.of(hrEntity);
    }

    @Override
    public List<HR_Entity> getAllHotels() {
        return hrRepository.findAll();
    }
}
