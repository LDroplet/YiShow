package cn.tzl.clothes.Module_Login.Bean;

/**
 * Created by Administrator on 2017/11/16 0016.
 */

import cn.bmob.v3.BmobObject;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2017/11/11 0011.
 */

public class User extends BmobObject {
    private String mobile;
    private String password;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
