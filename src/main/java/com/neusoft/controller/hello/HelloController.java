package com.neusoft.controller.hello;


import com.neusoft.bean.UserInfo;
import com.neusoft.mapper.UserMapper;
import com.neusoft.service.HelloService;
import com.neusoft.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Autowired
    IHelloService helloService;


    @RequestMapping("/")
    public String hello(Model model){
        helloService.addUser(new UserInfo());
        return "index";
    }

}
