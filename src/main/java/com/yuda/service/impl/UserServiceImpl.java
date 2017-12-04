package com.yuda.service.impl;

import com.yuda.dao.UserRepository;
import com.yuda.entity.User;
import com.yuda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @auther yuda
 * Create on 2017/12/4 11:17.
 * Project_name :   helloSSH
 * Package_name :   com.yuda.service.impl
 * Description  :   TODO
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
}
