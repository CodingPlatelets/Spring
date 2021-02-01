package cn.edu.wut.edward.Servlet;

import cn.edu.wut.edward.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wenka
 * @date 1/31/202118:27
 */
public class SpringContextServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        ApplicationContext app = (ApplicationContext) req.getAttribute("app");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();

//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService bean = app.getBean(UserService.class);
//        bean.save();
    }
}

