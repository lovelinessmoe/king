package com.king.bean;

import java.util.ArrayList;
import java.util.List;

public class FriendMangerBean {

    List<AccountManagerBean> accountlist = new ArrayList<AccountManagerBean>();

    public List<AccountManagerBean> getAccountlist() {
        return accountlist;
    }

    public void setAccountlist(List<AccountManagerBean> accountlist) {
        this.accountlist = accountlist;
    }
}
