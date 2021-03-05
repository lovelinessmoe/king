package com.king.service;

import com.king.bean.AccountManagerBean;
import com.king.bean.FriendMangerBean;

import java.util.Scanner;

public class FriendMangerServic {
    Scanner sc = new Scanner(System.in);

    FriendMangerBean friendBean = new FriendMangerBean();

    public void show() {
        System.out.println("你的好友有");
        for (AccountManagerBean accountBean : friendBean.getAccountlist()
                ) {
            System.out.println(accountBean.getU_name());
        }
    }


    public void add(AccountManagerService accountService) {
        System.out.println("请输入你要添加好友的名字");
        String name = null;
        name = sc.nextLine();
        for (AccountManagerBean accountBean : accountService.accountlist
                ) {
            if (name.equals(accountBean.getU_name())) {
                System.out.println("你是否要添加" + name + "为好友？");
                System.out.println("**********[1]确定 \t [2]取消***********");
                int input;
                input = sc.nextInt();
                if (input == 1){
                    friendBean.getAccountlist().add(accountBean);
                    System.out.println("添加好友成功");
                }
                else if(input == 2){

                }
            }
        }
    }
}
