package com.king.service;

import com.king.bean.AccountManagerBean;
import com.king.bean.GameBagMangerBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameBagMangerService {
    List<GameBagMangerBean> baglist = new ArrayList<GameBagMangerBean>();
    Scanner sc = new Scanner(System.in);

    public void show() {
        System.out.println("你现在背包里有:");
        for (GameBagMangerBean gameBagMangerBean : baglist) {
            System.out.println(gameBagMangerBean.getP_name());
        }
    }

    public void add(int i) {
        GameBagMangerBean BagBean = new GameBagMangerBean();
        BagBean.setP_name("物品" + i);
        baglist.add(BagBean);
    }

    public void use() {
        String name;
        System.out.println("请输入你要使用的道具");
        name = sc.nextLine();
        GameBagMangerBean gameBagBean = null;
        for (GameBagMangerBean gameBagMangerBean : baglist) {
            if (gameBagMangerBean.getP_name().equals(name)) {
                gameBagBean = gameBagMangerBean;
            }
        }
        if (gameBagBean != null) {
            baglist.remove(gameBagBean);
            System.out.println("你已经使用道具" + name);
        } else {
            System.err.println("该物品不存在");
        }
    }
}
