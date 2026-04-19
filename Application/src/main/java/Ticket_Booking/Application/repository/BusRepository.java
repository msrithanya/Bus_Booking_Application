package Ticket_Booking.Application.repository;

import Ticket_Booking.Application.entity.Bus;
import Ticket_Booking.Application.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BusRepository extends JpaRepository<Bus,Long> {

}
