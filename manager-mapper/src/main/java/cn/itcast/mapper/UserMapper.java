package cn.itcast.mapper;


import cn.itcast.pojo.User;

import java.util.List;

/**
 * @Auther: wanglei
 * @Date: 2019/7/1 23:22
 * @Description: cn.itcast.mapper
 * @Version: 1.0
 */
public interface UserMapper {
    void insertUser(User user);
    List<User> selectUserAll();
}
