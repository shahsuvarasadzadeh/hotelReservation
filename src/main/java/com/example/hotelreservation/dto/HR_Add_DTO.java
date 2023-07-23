package com.example.hotelreservation.dto;

import lombok.Data;

@Data
public class HR_Add_DTO {
    private String name;
    private String location;
    private Long star;

    public HR_Add_DTO(String name, String location, Long star) {
        this.name = name;
        this.location = location;
        this.star = star;
    }
}
