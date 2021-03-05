package com.king.bean;

import java.util.ArrayList;
import java.util.Date;

public class GameBagMangerBean {
    private String p_money, p_name, get_time, exp_time, creat_time_str;
    private int p_number;
    private Date creat_time;



    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }


    public int getP_number() {
        return p_number;
    }

    public void setP_number(int p_number) {
        this.p_number = p_number;
    }

    public String getP_money() {
        return p_money;
    }

    public void setP_money(String p_money) {
        this.p_money = p_money;
    }

    public String getGet_time() {
        return get_time;
    }

    public void setGet_time(String get_time) {
        this.get_time = get_time;
    }

    public String getExp_time() {
        return exp_time;
    }

    public void setExp_time(String exp_time) {
        this.exp_time = exp_time;
    }

    public String getCreat_time_str() {
        return creat_time_str;
    }

    public void setCreat_time_str(String creat_time_str) {
        this.creat_time_str = creat_time_str;
    }

    public Date getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(Date creat_time) {
        this.creat_time = creat_time;
    }

    @Override
    public String toString() {
        return "你的背包里有{" +
                "p_money='" + p_money + '\'' +
                ", p_name='" + p_name + '\'' +
                ", get_time='" + get_time + '\'' +
                ", exp_time='" + exp_time + '\'' +
                ", creat_time_str='" + creat_time_str + '\'' +
                ", p_number=" + p_number +
                ", creat_time=" + creat_time +
                '}';
    }
}
