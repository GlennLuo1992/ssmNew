package service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.UserMapper;
import pojo.User;
import service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserbyID(int UserID) {
        return this.userMapper.selectUserByID(UserID);
    }

    @Override
    public List<User> selectAll() {
        return this.userMapper.selectAll();
    }
}
