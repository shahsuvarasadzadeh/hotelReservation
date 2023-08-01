package com.example.hotelreservation.dto;
import com.example.hotelreservation.model.HR_Entity;
import lombok.Data;
@Data
public class HR_DTO {
    private final Long id;
    private final String name;
    private final String location;
    private final Long star;
    public HR_DTO(Long id, String name, String location, Long star) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.star = star;
    }
    public static HR_DTO of(HR_Entity hrEntity){
        return new HR_DTO(hrEntity.getId(), hrEntity.getName(),hrEntity.getLocation(),hrEntity.getStar());
    }
}