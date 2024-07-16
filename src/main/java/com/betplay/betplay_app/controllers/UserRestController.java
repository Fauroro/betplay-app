package com.betplay.betplay_app.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.betplay.betplay_app.models.User;
import com.betplay.betplay_app.models.dto.UserDto;

import java.util.ArrayList;
// import java.util.HashMap;
import java.util.List;
// import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/api")

public class UserRestController {

    @GetMapping("/v2/details")
    public UserDto details(){
        User user = new User("Fauroro","Rdz");
        UserDto userDto = new UserDto();
        userDto.setTitle("Ingeniero");
        userDto.setUser(user);
        return userDto;
        
    }

    @GetMapping("/list-details")
    public List<User> listdetails(){
        User user = new User("Juan", "Perez");
        User userA = new User("Pepe", "Etesech");
        User userB = new User("Bastian", "Mbappe");
        List<User> lstUsers = new ArrayList<>();
        lstUsers.add(user);
        lstUsers.add(userA);
        lstUsers.add(userB);
        return lstUsers;
    }
    
    // public Map<String,Object> details(){
    //     User user = new User("Johlver","Pardo");
    //     Map<String,Object> body = new HashMap<>();
    //     body.put("nombre", user.getNombre());
    //     body.put("apellido", user.getApellido());
    //     return body;
        
    // }
}
