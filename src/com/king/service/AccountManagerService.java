package com.king.service;

import com.king.bean.AccountManagerBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManagerService {
    List<AccountManagerBean> accountlist = new ArrayList<AccountManagerBean>();
    Scanner sc = new Scanner(System.in);
    AccountManagerBean accountLogin = null;

    public boolean register() {
        String u_name = " ";
        String u_pwd = " ";
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入注册名：");
            u_name = sc.next();
            System.out.println("请输入密码：");
            u_pwd = sc.next();
            AccountManagerBean account = new AccountManagerBean();
            account.setU_name(u_name);
            account.setU_pwd(u_pwd);
            accountlist.add(account);
            return true;
        }
    }

    public boolean login() {
        int count = 0;
        while (true) {
            if (count == 3) {
                System.err.println("您的登陆次数达到上限，请稍后重试！");
                break;
            }
            System.out.println("请输入用户名：");
            String u_name = sc.next();
            System.out.println("请输入密码：");
            String u_pwd = sc.next();
            int flag = 0;
            for (AccountManagerBean accountManagerBean : accountlist) {
                if (accountManagerBean.getU_name().equals(u_name)) {
                    if (accountManagerBean.getU_pwd().equals(u_pwd)) {
                        //把用户信息存起来
                        accountLogin = accountManagerBean;
                        return true;
                    } else {
                        flag = -1;
                    }
                    flag = 1;
                }
            }
            if (flag <= 0) {
                count++;
                System.err.println("用户账号不存在或密码错误！！！！");
            }
        }
        return false;
    }

    public void show(AccountManagerService accountService) {
        System.out.println(accountLogin.getU_name());
        System.out.print("金币"+accountLogin.getU_glod());
        System.out.print("钻石"+accountLogin.getU_diamond());
        System.out.print("点券"+accountLogin.getU_money());
        System.out.println();
    }


    public void accountloginSet(int glod, int diamond, int money) {
        accountLogin.setU_money(money);
        accountLogin.setU_diamond(diamond);
        accountLogin.setU_glod(glod);

    }
}
