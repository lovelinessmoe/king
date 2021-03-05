package com.king.service;

import com.king.bean.GameBagMangerBean;
import com.king.bean.HeroMangerBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeroMangerService {
    List<HeroMangerBean> herolist = new ArrayList<HeroMangerBean>();
    HeroMangerBean heroMangerBean = new HeroMangerBean();
    Scanner sc = new Scanner(System.in);

    public void add(int i) {
        HeroMangerBean heroBean = new HeroMangerBean();
        heroBean.setH_name("英雄" + i);
        heroBean.setH_money(i * 100);
        heroBean.setU_skill("技能" + i);
        herolist.add(heroBean);
    }

    public void show() {
        System.out.println("现在英雄池有:");
        for (HeroMangerBean heroMangerBean : herolist) {
            System.out.println(heroMangerBean.getH_name());
            if (heroMangerBean.isIs_get())
                System.out.println("已拥有");
            else
                System.out.println("未拥有");
        }
    }

    public void slect(AccountManagerService accountService) {
        String name;
        System.out.println("请输入你要选择的英雄");
        name = sc.nextLine();
        HeroMangerBean heroBean = null;
//        遍历英雄list
        for (HeroMangerBean heroMangerBean : herolist) {
            if (heroMangerBean.getH_name().equals(name)) {
                heroBean = heroMangerBean;
            }
        }
        if (heroBean != null) {
            System.out.println("**********" + heroBean.getH_name() + "************");
            System.out.println("**********[1]查看技能 \t [2]购买英雄***********");
            System.out.println("**************[其他]取消***************");
            int input = sc.nextInt();
            if (input == 1) {
                System.out.println("该英雄的技能有:");
                System.out.println(heroBean.getU_skill());
            } else if (input == 2) {
                System.out.println("英雄的价格是:" + heroBean.getH_money());
                System.out.println("**********[1]购买 \t [其他]取消***********");
                input = sc.nextInt();
                if (input == 1) {
                    if (heroBean.isIs_get())
                        System.out.println("你已经拥有此英雄");
                    else {
                        System.out.println("**********[1]金币 \t [2]钻石***********");
                        System.out.println("**************[其他]取消***************");
                        input = sc.nextInt();
                        if (input == 1)
                            if (accountService.accountLogin.getU_glod() >= heroBean.getH_money())
                                accountService.accountLogin.setU_glod(accountService.accountLogin.getU_glod() - heroBean.getH_money());
                            else
                                System.err.println("你的金币不够");
                        else if (input == 2)
                            if (accountService.accountLogin.getU_diamond() >= heroBean.getH_money())
                                accountService.accountLogin.setU_diamond(accountService.accountLogin.getU_diamond() - heroBean.getH_money());
                            else
                                System.err.println("你的钻石不够");
                        heroBean.setIs_get(true);
                    }
                }
            }
            System.out.println("**************[其他]退出***************");
        } else {
            System.out.println("该英雄不存在");
        }
    }
}
