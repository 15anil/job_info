package com.example.User.registration.Service;

import com.example.User.registration.Repo.UserRepo;
import com.example.User.registration.UserRegistrationApplication;
import com.example.User.registration.model.UserRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {
    @Autowired
    private UserRepo userRepo;
    public UserRegistration addUser(UserRegistration userRegistration){
        return userRepo.save(userRegistration);
    }
    public List<UserRegistration> getUser(UserRegistration userRegistration){
        return userRepo.findAll();
    }
    public UserRegistration findUserById(int id){
        Optional<UserRegistration> userRegistration = userRepo.findById(id);
        return userRegistration.orElse(new UserRegistration());
    }
    public void deleteUserById(int id){
        userRepo.deleteById(id);
    }


}
