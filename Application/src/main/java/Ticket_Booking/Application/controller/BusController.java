package Ticket_Booking.Application.controller;

import Ticket_Booking.Application.entity.Bus;
import Ticket_Booking.Application.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BusController {
    @Autowired
    BusService busservice;
    @PostMapping("/createBus")
    public Bus createbus(@RequestBody Bus b){
        return busservice.createB(b);
    }
    @DeleteMapping("/busdelete/{id}")
    public List<Bus> deletebus(@PathVariable long id){
        return busservice.deleteB(id);
    }

}
