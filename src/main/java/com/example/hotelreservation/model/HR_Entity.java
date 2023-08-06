package com.example.hotelreservation.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@Table(name = "Hotel_Reservation")
@Data
@AllArgsConstructor
public class HR_Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String location;
    private Long star;
    public HR_Entity(String name,String location,Long star){
        this.name=name;
        this.location=location;
        this.star=star;
    }
}