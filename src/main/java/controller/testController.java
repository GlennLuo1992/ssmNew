package controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.User;
import service.UserService;

import java.util.List;

@Controller
public class testController {

    @Autowired
    private UserService userService;

    private final Logger logger = Logger.getLogger(testController.class);


    @RequestMapping("/tt")
    @ResponseBody
    public String jsonTest() {
        logger.info("/tt");
        return "hello spring mvc";
    }

    @RequestMapping("/Id")
    @ResponseBody
    public User findUserById(int id) {
        return userService.selectUserbyID(id);
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<User> findAll() {
        return userService.selectAll();
    }
}
