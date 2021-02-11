package cn.manag.myManager.service;

import cn.manag.myManager.Menu;
import cn.manag.myManager.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;
    public List<Menu> findAllMenu(int first,int second){
        return menuMapper.findAllMenu(first,second);
    }
    public Boolean insertMenu(Menu menu){
        return menuMapper.insertMenu(menu);
    }
    public Menu findMenuById(int id){
        return menuMapper.findMenuById(id);
    }
    public List<Menu> findMenuByUserId(int id){
        return menuMapper.findMenuByUserId(id);
    }
    public Boolean deleteMenuById(int id){
        return menuMapper.deleteMenuById(id);
    }
}
