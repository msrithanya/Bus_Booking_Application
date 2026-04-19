package Ticket_Booking.Application.controller;

import Ticket_Booking.Application.entity.Bus;
import Ticket_Booking.Application.service.BusService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
public class BusController {
    @Autowired
    BusService busservice;
    @PostMapping("/createBus")
    public Bus createbus(@RequestBody Bus b){
        log.info("Admin created Bus!!!!!!!!");
        return busservice.createB(b);
    }
    @DeleteMapping("/busdelete/{id}")
    public List<Bus> deletebus(@PathVariable long id){
        return busservice.deleteB(id);
    }
    @DeleteMapping("/deleteAllBus")
    public String deleteAllBus(){
        return busservice.deleteallbus();
    }
    @GetMapping("/getallbus")
    public List<Bus> getallbus(){
        return busservice.getAllBus();
    }

}
