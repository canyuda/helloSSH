package com.yuda.web;

import com.yuda.entity.User;
import com.yuda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @auther yuda
 * Create on 2017/12/4 11:05.
 * Project_name :   helloSSH
 * Package_name :   com.yuda.web
 * Description  :   TODO
 */
@Controller
@RequestMapping(value = "/hello")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/demo1")
    public String list(Model model) {
        List<User> list = userService.list();
        model.addAttribute("userList", list);
        return "list_page";
    }

}
