package com.yuda.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @auther yuda
 * Create on 2017/12/4 11:03.
 * Project_name :   helloSSH
 * Package_name :   com.yuda.entity
 * Description  :   TODO
 */
@Entity
@Table(name = "I_USER")
@Data
public class User {

    @Id
    @GeneratedValue()
    @Column(name = "C_ID")
    private Integer id; // 主键id
    @Column(name = "C_USERNAME")
    private String username; // 用户名
    @Column(name = "C_PASSWORD")
    private String password; // 密码
    @Column(name = "C_BRITHDAY")
    @Temporal(TemporalType.DATE)
    private Date birthday; // 生日
}
