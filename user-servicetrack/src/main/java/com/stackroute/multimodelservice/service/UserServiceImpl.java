package com.stackroute.multimodelservice.service;

import com.stackroute.multimodelservice.domain.User;
import com.stackroute.multimodelservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
   private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        User savedUser=userRepository.save(user);
        return savedUser;
    }

    @Override
    public User getUserById(int id) {
        User retrievedUser=userRepository.findById(id).get();
        return retrievedUser;
    }

}
