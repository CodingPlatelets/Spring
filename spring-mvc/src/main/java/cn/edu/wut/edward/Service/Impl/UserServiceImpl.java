package cn.edu.wut.edward.Service.Impl;

import cn.edu.wut.edward.Dao.UserDao;
import cn.edu.wut.edward.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wenka
 * @date 1/31/202118:24
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void save() {
        userDao.save();
    }
}

