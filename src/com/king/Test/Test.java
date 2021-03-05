package com.king.Test;

import com.king.service.AccountManagerService;
import com.king.service.FriendMangerServic;
import com.king.service.GameBagMangerService;
import com.king.service.HeroMangerService;
//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("------------欢迎来到王者荣耀---------------");
        AccountManagerService accountService = new AccountManagerService();
        while (true) {
            System.out.println("------------1.注册 \t2.登录---------------");
            Scanner sc = new Scanner(System.in);
            int memu = sc.nextInt();
            if (memu == 1) {
                if (accountService.register()) {
                    System.out.println("注册成功");
                } else {
                    System.out.println("注册失败");
                }
            } else {
                if (accountService.login()) {
                    System.out.println("登录成功，进入主界面");
                    GameBagMangerService gameBagService = new GameBagMangerService();
                    //////////////////////////////
                    for (int i = 0; i < 10; i++) {
//                                随机物品生成名字
                        gameBagService.add(i);
                    }
                    HeroMangerService heroService = new HeroMangerService();
                    for (int i = 0; i < 10; i++) {
//                                随机物品生成英雄
                        heroService.add(i);
                    }
                    accountService.accountloginSet(10000, 100, 10000);
//                    调试
                    //////////////////////////////

                    while (true) {
                        System.out.println("**************************************");
                        accountService.show(accountService);//展示用户信息
                        System.out.println("**********[1]背包 \t [2]英雄***********");
                        System.out.println("**************[3]好友 \t *************");
                        System.out.println("**************[其他]退出***************");
                        System.out.println("**************************************");

                        int input = sc.nextInt();
                        if (input == 1) {//道具
                            System.out.println("**********[1]查看 \t [2]使用***********");
                            input = sc.nextInt();
                            if (input == 1) {//查看
                                gameBagService.show();
                            } else if (input == 2) {//使用道具
                                gameBagService.use();
                            } else {
                                System.err.println("输入有误，清重新输入");
                            }
                        } else if (input == 2) {//英雄
                            System.out.println("**********[1]查看 \t [2]选择***********");
                            input = sc.nextInt();
                            if (input == 1) {//查看英雄
                                heroService.show();
                            } else if (input == 2) {//选择英雄跳转进行选择和购买操作
                                heroService.slect(accountService);
                            } else {
                                System.err.println("输入有误，清重新输入");
                            }

                        } else if (input == 3) {//好友
//                            System.out.println("不会做");
                            FriendMangerServic friendServic = new FriendMangerServic();
                            System.out.println("**********[1]查看好友 \t [2]加好友***********");
                            input = sc.nextInt();
                            if (input == 1)
                                friendServic.show();
                            else if (input == 2)
                                friendServic.add(accountService);
                        } else {
                            System.err.println("是否确认退出？");
                            System.out.println("**********[1]确定 \t [2]取消***********");
                            input = sc.nextInt();
                            if (input == 1)
                                System.exit(0);
                        }
                    }
                } else {
                    System.exit(0);
                }
            }
        }
    }
}
