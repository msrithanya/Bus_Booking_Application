package Ticket_Booking.Application.service;

import Ticket_Booking.Application.dto.Loginuser;
import Ticket_Booking.Application.entity.Users;
import Ticket_Booking.Application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userrespository;
    public String createuser(Users u) {

        Optional<Users> optionalUser = userrespository.findByEmail(u.getEmail());

        if (optionalUser.isEmpty()) {
            userrespository.save(u);
            return "Created Successfullly";// ✅ no crash
        }
        else{
            return "user already exist";
        }

    }

    public String loginusers(Loginuser lu) {

        String email = lu.getEmail();

        Optional<Users> optionalUser = userrespository.findByEmail(email);

        if (optionalUser.isEmpty()) {
            return "User not found";   // ✅ no crash
        }

        Users user = optionalUser.get();

        if (user.getPassword().equals(lu.getPassword())) {
            return "Login successful";
        } else {
            return "Invalid password";
        }
    }

    public List<Users> getAll() {
        return userrespository.findAll();
    }

    public void deleteu(long id) {
        userrespository.deleteById(id);
    }
}
