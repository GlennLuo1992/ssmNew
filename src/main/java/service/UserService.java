package service;

import pojo.User;

import java.util.List;

public interface UserService {
    User selectUserbyID(int UserID);
    List<User> selectAll();
}
