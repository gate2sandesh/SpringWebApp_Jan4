package com.interest.repository.impl;

import com.interest.repository.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public int calculateRepository(int principal, int time, int rate) {

        int interest = (principal * time * rate) / 100;
        return interest;


    }

//    public void childMethod() {
//        int a = 2;
//
//    }
}
