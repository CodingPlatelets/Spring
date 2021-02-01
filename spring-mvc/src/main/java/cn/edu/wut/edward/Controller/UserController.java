package cn.edu.wut.edward.Controller;

import cn.edu.wut.edward.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wenka
 * @date 1/31/202120:05
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/run")
    public String save(){
        userService.save();
        return "success.jsp";
    }
}

