package com.example.User.registration.UserController;

import com.example.User.registration.Service.UserService;
import com.example.User.registration.model.UserRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public ResponseEntity<UserRegistration> addUser(@RequestBody UserRegistration userRegistration){
        UserRegistration userRegistration1 = userService.addUser(userRegistration);
        return ResponseEntity.ok(userRegistration1);
    }
    @GetMapping("/getUsers")
    public List<UserRegistration> getUser(@RequestBody UserRegistration userRegistration){
        List<UserRegistration> userRegistrationList = userService.getUser(userRegistration);
        return userRegistrationList;
    }
    @GetMapping("/findById/{id}")
    public UserRegistration findUserById(@PathVariable int id){
        return userService.findUserById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable int id){
        userService.deleteUserById(id);
    }
}
