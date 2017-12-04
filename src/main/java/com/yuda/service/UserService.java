package com.yuda.service;

import com.yuda.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther yuda
 * Create on 2017/12/4 11:04.
 * Project_name :   helloSSH
 * Package_name :   com.yuda.service
 * Description  :   TODO
 */
public interface UserService {

    List<User> list();

}
