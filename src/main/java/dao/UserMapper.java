package dao;

import org.springframework.stereotype.Repository;
import pojo.User;

import java.util.List;

@Repository
public interface UserMapper {
   User selectUserByID(int UserID);
   List<User> selectAll();
}
