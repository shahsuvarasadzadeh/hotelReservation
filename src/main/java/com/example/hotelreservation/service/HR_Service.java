package com.example.hotelreservation.service;
import com.example.hotelreservation.dto.HR_Add_DTO;
import com.example.hotelreservation.exceptions.NotFoundException;
import com.example.hotelreservation.model.HR_Entity;
import com.example.hotelreservation.repository.HR_Repository;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service
public class HR_Service implements HR_Interface{
    private final HR_Repository hrRepository;
    public HR_Service(HR_Repository hrRepository) {
        this.hrRepository = hrRepository;
    }

    @Override
    public HR_Entity addHotel(HR_Add_DTO hrAddDto) {
        final HR_Entity hrEntity;
        hrEntity = hrRepository.save(new HR_Entity(hrAddDto.getName(),
                hrAddDto.getLocation(), hrAddDto.getStar()));
        return hrEntity;
    }
    @Override
    public Set<HR_Entity> getAllHotels() {
        List<HR_Entity> hrEntities=hrRepository.findAll();
        return new HashSet<>(hrEntities);
    }
    @Override
    public HR_Entity getHotelsById(Long id) {
        return null;
    }
    @Override
    public void deleteHotelsById(Long id) {
        final HR_Entity hr = hrRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("user not found"));
        hrRepository.delete(hr);
    }
}