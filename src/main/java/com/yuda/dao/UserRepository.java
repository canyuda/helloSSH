package com.yuda.dao;

import com.yuda.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther yuda
 * Create on 2017/12/4 11:04.
 * Project_name :   helloSSH
 * Package_name :   com.yuda.com.yuda.dao
 * Description  :   TODO
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
