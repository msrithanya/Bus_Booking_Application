package Ticket_Booking.Application.service;

import Ticket_Booking.Application.entity.Bus;
import Ticket_Booking.Application.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {
@Autowired
    BusRepository busrepository;
    public Bus createB(Bus b) {
        return busrepository.save(b);
    }

    public List<Bus> deleteB(long id) {
        busrepository.deleteById(id);
        return busrepository.findAll();
    }

    public List<Bus> getAllBus() {
        return busrepository.findAll();
    }

    public String deleteallbus() {
        busrepository.deleteAll();
        return "deleted all bus";
    }
}
