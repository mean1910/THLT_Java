package com.example.__TrongNghia.services;

import com.example.__TrongNghia.entity.User;
import com.example.__TrongNghia.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }
}
