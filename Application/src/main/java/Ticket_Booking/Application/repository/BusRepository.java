package Ticket_Booking.Application.repository;

import Ticket_Booking.Application.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus,Long> {
}
