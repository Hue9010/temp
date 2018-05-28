package com.example.mybatispractice.service;

import com.example.mybatispractice.domain.UserVo;
import com.example.mybatispractice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserVo> test(){
        return userRepository.getUserList();
    }

}
