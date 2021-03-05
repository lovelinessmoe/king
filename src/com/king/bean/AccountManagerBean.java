package com.king.bean;

import java.util.List;

public class AccountManagerBean {
    private String u_name, u_pwd, u_id, u_duan;
    private int u_money, u_diamond, u_glod;
    private List<AccountManagerBean> friend_list;

    public String getU_name() {
        return u_name;
    }


    public List<AccountManagerBean> getFriend_list() {
        return friend_list;
    }

    public void setFriend_list(List<AccountManagerBean> friend_list) {
        this.friend_list = friend_list;
    }

    public String getU_duan() {
        return u_duan;
    }

    public void setU_duan(String u_duan) {
        this.u_duan = u_duan;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public int getU_money() {
        return u_money;
    }

    public void setU_money(int u_money) {
        this.u_money = u_money;
    }

    public int getU_diamond() {
        return u_diamond;
    }

    public void setU_diamond(int u_diamond) {
        this.u_diamond = u_diamond;
    }

    public int getU_glod() {
        return u_glod;
    }

    public void setU_glod(int u_glod) {
        this.u_glod = u_glod;
    }
}
