package cn.manag.myManager.controller;

import cn.manag.myManager.User;
import cn.manag.myManager.service.UserService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findAll")
    public ModelAndView findAllUser(int first , int second){
//        if("html".equals(type)){
//            ModelAndView mav = new ModelAndView("users");
//            mav.addObject("users",userService.findAll());
//            return mav;
//        }else {
            ModelAndView mav = new ModelAndView(new MappingJackson2JsonView());
            mav.addObject("users", userService.findAll(first, second));
            return mav;
//        }
    }

    @RequestMapping(value = "/findUserById")
    public ModelAndView findUserById( int user_id){
//        if("html".equals(type)){
//            ModelAndView mav = new ModelAndView("user");
//            mav.addObject("user",userService.findUserById(user_id));
//            return mav;
//        }else{
            ModelAndView mav = new ModelAndView(new MappingJackson2JsonView());
            mav.addObject("user",userService.findUserById(user_id));
            return mav;
//        }
    }

    @RequestMapping(value = "/addUser")
    public  ModelAndView addUser( String username, int password ){
//        System.out.println(user.toString());
        ModelAndView mav = new ModelAndView((new MappingJackson2JsonView()));
        Boolean bol = userService.addUser(username,password);
        User user = userService.login(username,password);
        mav.addObject("user",user);
        mav.addObject("flag",true);
        return mav;
    }

    @RequestMapping(value = "/deleteUser")
    public  ModelAndView deleteUser( int user_id ){
        ModelAndView mav = new ModelAndView((new MappingJackson2JsonView()));
        mav.addObject("flag",userService.deleteUser(user_id));
        return mav;
    }

    @RequestMapping(value = "/updateUser")
    public  ModelAndView updateUser(String username, String password, int user_id ){
        ModelAndView mav = new ModelAndView((new MappingJackson2JsonView()));

        mav.addObject("flag",userService.updateUser(user_id,username,password));
        return mav;
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(String username , int password){
        System.out.println(username);
        System.out.println(password);
        ModelAndView mav = new ModelAndView(new MappingJackson2JsonView());
        User user = userService.login(username,password);
        if(user == null){
            mav.addObject("user",null);
            mav.addObject("flag",false);
            return mav;
        }
        System.out.println(user.getUser_id());
        mav.addObject("user",user);
        mav.addObject("flag",true);
        return mav;
    }

    @RequestMapping(value = "/findsize")
    public ModelAndView findsize(){
        ModelAndView mav = new ModelAndView(new MappingJackson2JsonView());
        List<User> userlist = userService.findsize();
        int size = userlist.size();
        mav.addObject("size",size);
        mav.addObject("flag",true);
        return mav;
    }
}
