package cn.manag.myManager;

public class Menu {
    private int menu_id;
    private String menu_name;
    private String menu_address;
    private String menu_rename;  //用户名
    private String menu_phone;
    private int user_id;

    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public String getMenu_address() {
        return menu_address;
    }

    public void setMenu_address(String menu_address) {
        this.menu_address = menu_address;
    }

    public String getMenu_rename() {
        return menu_rename;
    }

    public void setMenu_rename(String menu_rename) {
        this.menu_rename = menu_rename;
    }

    public String getMenu_phone() {
        return menu_phone;
    }

    public void setMenu_phone(String menu_phone) {
        this.menu_phone = menu_phone;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
