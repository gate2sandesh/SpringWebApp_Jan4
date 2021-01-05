package com.interest.service.impl;

import com.interest.repository.UserRepository;
import com.interest.repository.impl.UserRepositoryImpl;
import com.interest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepositoryImpl userRepository;


    @Override
    public int calculateService(int principal, int time, int rate) {
        int interest = userRepository.calculateRepository(principal, time, rate);
        //   userRepository.childMethod();
        //  int interest = (principal * time * rate) / 100;
        return interest;
    }


}
