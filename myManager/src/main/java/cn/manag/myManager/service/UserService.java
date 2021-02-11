package cn.manag.myManager.service;

import cn.manag.myManager.User;
import cn.manag.myManager.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> findAll(int first , int second ){
        return userMapper.findAll(first, second);
    }
    public User findUserById(int user_id) {
        return userMapper.findUserById(user_id);
    }


    public Boolean addUser(String username , int password) {
        return userMapper.addUser(username,password);
    }

    public boolean deleteUser(int user_id){
        return userMapper.deleteUser(user_id);
    }

    public boolean updateUser(int user_id,String username,String password){
        return userMapper.updateUser(username,password,user_id);
    }

    public User login(String username , int password){
        User user= userMapper.login(username,password);

        return user;
    }

    public List<User> findsize(){
        List<User> userlist = userMapper.findsize();
        return  userlist;
    }
}
