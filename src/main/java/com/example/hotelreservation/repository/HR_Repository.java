package com.example.hotelreservation.repository;

import com.example.hotelreservation.model.HR_Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HR_Repository extends JpaRepository<HR_Entity,Long> {
}
