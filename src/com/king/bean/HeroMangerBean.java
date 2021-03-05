package com.king.bean;

public class HeroMangerBean {
    private String h_name,u_skill;
    private int h_money;
    private boolean is_get;

    public boolean isIs_get() {
        return is_get;
    }

    public void setIs_get(boolean is_get) {
        this.is_get = is_get;
    }

    public String getH_name() {
        return h_name;
    }

    public void setH_name(String h_name) {
        this.h_name = h_name;
    }

    public String getU_skill() {
        return u_skill;
    }

    public void setU_skill(String u_skill) {
        this.u_skill = u_skill;
    }

    public int getH_money() {
        return h_money;
    }

    public void setH_money(int h_money) {
        this.h_money = h_money;
    }
}
