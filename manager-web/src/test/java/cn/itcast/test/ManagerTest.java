package cn.itcast.test;

import cn.itcast.mapper.UserMapper;
import cn.itcast.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: wanglei
 * @Date: 2019/7/2 9:54
 * @Description:
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class ManagerTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void inserUserTest(){
        User user = new User();
        user.setUsername("admin");
        user.setPassword("234");
        this.userMapper.insertUser(user);
    }
}
