package cn.manag.myManager.mapper;

import cn.manag.myManager.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> findAll(int first,int second);
    User findUserById(int user_id);
    Boolean addUser(String username,int password);
    Boolean deleteUser(int user_id);
    Boolean updateUser(String username,String password , @Param("id") int user_id);
    User login(String username,int password);
    List<User> findsize();
}
