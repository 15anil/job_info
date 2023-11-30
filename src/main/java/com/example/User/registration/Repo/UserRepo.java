package com.example.User.registration.Repo;

import com.example.User.registration.model.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserRegistration,Integer> {
}
