package cn.edu.wut.edward.Dao.Impl;

import cn.edu.wut.edward.Dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author wenka
 * @date 1/31/202118:23
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("Hello world");
    }
}

