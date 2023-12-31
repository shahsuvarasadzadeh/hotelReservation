package com.example.hotelreservation.contoller;
import com.example.hotelreservation.dto.HR_Add_DTO;
import com.example.hotelreservation.model.HR_Entity;
import com.example.hotelreservation.service.HR_Interface;
import org.springframework.web.bind.annotation.*;
import java.util.Set;
@RestController
@RequestMapping(path = "/api")
public class HR_Controller {
    private final HR_Interface hrInterface;
    public HR_Controller(HR_Interface hrInterface) {
        this.hrInterface = hrInterface;
    }
    @PostMapping(path = "/addHotel")
    public HR_Entity addHotel(@RequestBody HR_Add_DTO hrAddDto) {
        return hrInterface.addHotel(hrAddDto);
    }
    @GetMapping(path = "/allHotel")
    public Set<HR_Entity> allHotels(){
       return hrInterface.getAllHotels();
    }
    @DeleteMapping(path = "/delete/{id}")
    public void deleteHotel(@PathVariable Long id){
        hrInterface.deleteHotelsById(id);
    }
    @GetMapping(path = "/search/{id}")
    public HR_Entity hotelById(@PathVariable Long id){
        HR_Entity hr=hrInterface.getHotelsById(id);
        return hr;
    }
    @PutMapping(path = "/update/{id}")
    public HR_Entity updateHotel(@PathVariable Long id,@RequestBody HR_Add_DTO hrAddDto){
        HR_Entity hr=hrInterface.updateHotl(id,hrAddDto);
        return hr;
    }
}