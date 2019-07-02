package cn.itcast.controller;

import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: wanglei
 * @Date: 2019/7/2 11:15
 * @Description: cn.itcast.controller
 * @Version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public String addUser(User user){
        this.userService.addUser(user);
        return "ok";
    }

    /**
     * doGet
     */
    @RequestMapping(value = "/doGet/{userid}",method = RequestMethod.GET)
    public String doGet(@PathVariable Integer userid){
        System.out.println("doGET....."+userid);
        return "ok";
    }

    /**
     * doPost
     */
    @RequestMapping(value = "/doPost",method = RequestMethod.POST)
    public String doGet(User user){
        System.out.println("doPost.....");
        System.out.println(user);
        return "ok";
    }

    /**
     * doDelete
     */
    @RequestMapping(value = "/doDelete",method = RequestMethod.DELETE)
    public String doDelete(Integer userid){
        System.out.println("doDelete....."+userid);
        return "ok";
    }

    /**
     * doPut
     */
    @RequestMapping(value = "/doPut",method = RequestMethod.PUT)
    public String doPut(){
        System.out.println("doPut.....");
        return "ok";
    }
}
