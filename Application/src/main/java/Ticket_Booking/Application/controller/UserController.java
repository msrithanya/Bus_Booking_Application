package Ticket_Booking.Application.controller;

import Ticket_Booking.Application.dto.Loginuser;
import Ticket_Booking.Application.entity.Users;
import Ticket_Booking.Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userservice;

    @PostMapping("/register")
    public String registerUser(@RequestBody Users u){
        return userservice.createuser(u);
    }
    @PostMapping("/login")
    public String loginUser(@RequestBody Loginuser lu){
        return userservice.loginusers(lu);
    }
    @DeleteMapping("/{id}")
    public String deleteuser(@PathVariable long id){
        userservice.deleteu(id);
        return "deleted";
    }
    @GetMapping
    public List<Users> getAllUsers(){
        return userservice.getAll();
    }
}
