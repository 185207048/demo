package cn.manag.myManager.mapper;

import cn.manag.myManager.Menu;

import java.util.List;

public interface MenuMapper {
    List<Menu> findAllMenu(int first, int second);
    Boolean insertMenu(Menu menu);
    Menu findMenuById(int id);
    List<Menu> findMenuByUserId(int id);
    Boolean deleteMenuById(int id);
}
