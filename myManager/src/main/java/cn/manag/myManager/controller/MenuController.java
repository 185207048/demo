package cn.manag.myManager.controller;

import cn.manag.myManager.Menu;
import cn.manag.myManager.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@RestController
public class MenuController {
    @Autowired
    MenuService menuService;
    @RequestMapping(value = "/findAllMenu")
    public ModelAndView findAllMenu(int first, int second){
        ModelAndView mav = new ModelAndView(new MappingJackson2JsonView());
        mav.addObject("menus",menuService.findAllMenu(first,second));
        return mav;
    }

    @RequestMapping(value = "/insertMenu")
    public ModelAndView insertMenu(Menu menu){
        System.out.println(menu);
        ModelAndView mav = new ModelAndView(new MappingJackson2JsonView());
        mav.addObject("flag",menuService.insertMenu(menu));
        return mav;
    }

    @RequestMapping(value = "/findMenuById")
    public ModelAndView findMenuById(int menu_id){
        ModelAndView mav = new ModelAndView(new MappingJackson2JsonView());
        mav.addObject("menu",menuService.findMenuById(menu_id));
        return  mav;
    }

    @RequestMapping(value = "/findMenuByUserId")
    public ModelAndView findMenuByUserId(int user_id){
        ModelAndView mav = new ModelAndView(new MappingJackson2JsonView());
        mav.addObject("menus",menuService.findMenuByUserId(user_id));
        return mav;
    }

    @RequestMapping(value = "/deleteMenuById")
    public ModelAndView deleteMenuById(int menu_id){
        ModelAndView mav = new ModelAndView((new MappingJackson2JsonView()));
        mav.addObject("flag",menuService.deleteMenuById(menu_id));
        return mav;
    }
}
