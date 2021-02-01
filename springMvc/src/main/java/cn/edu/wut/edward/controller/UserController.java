package cn.edu.wut.edward.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wenka
 * @date 1/31/202119:24
 */
@Controller
public class UserController {

    @RequestMapping("/run")
    public String save(){
        System.out.println("Controller save");
        return "success.jsp";
    }
}

