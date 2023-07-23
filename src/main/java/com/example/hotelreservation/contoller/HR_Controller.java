package com.example.hotelreservation.contoller;

import com.example.hotelreservation.dto.HR_Add_DTO;
import com.example.hotelreservation.model.HR_Entity;
import com.example.hotelreservation.service.HR_Interface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/api")
public class HR_Controller {
    private final HR_Interface hrInterface;

    public HR_Controller(HR_Interface hrInterface) {
        this.hrInterface = hrInterface;
    }

    @PostMapping(path = "/addHotel")
    public String addHotel(@RequestBody HR_Add_DTO hrAddDto) {
        hrInterface.addHotel(hrAddDto);
        return "hr";
    }
    @GetMapping(path = "/allHotel")
    public String allHotels(Model model){
        final List<HR_Entity> hrEntities=hrInterface.getAllHotels();
        model.addAttribute("Hotels",hrEntities);
        return "hr";
    }

}
