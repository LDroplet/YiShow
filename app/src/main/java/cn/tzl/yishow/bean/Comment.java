package cn.tzl.yishow.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by Tanzl on 2018/5/1.
 * Class Comment:
 */

public class Comment extends BmobObject {
    private String username;
    private String image;
    private String avatar;
    private String ccontent;
    private String cnun;
    private String likenum;
    private String time;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }



    public String getLikenum() {
        return likenum;
    }

    public void setLikenum(String likenum) {
        this.likenum = likenum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent;
    }

    public String getCnun() {
        return cnun;
    }

    public void setCnun(String cnun) {
        this.cnun = cnun;
    }
}
