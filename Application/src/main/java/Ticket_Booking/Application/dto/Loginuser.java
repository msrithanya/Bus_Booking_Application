package Ticket_Booking.Application.dto;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;

@Data
public class Loginuser {
   @NotBlank
    String email;
    String password;
}
