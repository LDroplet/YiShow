package cn.tzl.yishow.module_Login.model;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;
import cn.tzl.yishow.bean.MyUser;
import cn.tzl.yishow.module_Login.activity.LoginActivity;

public class UserRegister {
    private static final String TAG = "UserRegister";
    public static void userRegister(final Context mContent,String username, final String mobile, String password,String email) {
        final MyUser user=new MyUser();

       // BmobUser user = new BmobUser();
        user.setUsername(username);
        user.setMobilePhoneNumber(mobile);
        user.setPassword(password);
        user.setEmail(email);
        user.setAvatar("https://note.youdao.com/yws/public/resource/b4b16e1c45c7bd76d48c0cac163b32ac/xmlnote/3d6ee255e8081123764ad2016ef9a47a/499");
        user.signUp(new SaveListener<String>() {
            @Override
            public void done(String objectId, BmobException e) {
                Log.e(TAG, "done: "+e);
                if (e.getErrorCode() == 9015) {
                    Toast.makeText(mContent, "注册成功", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(mContent, LoginActivity.class);
                    intent.putExtra("username", mobile);
                    mContent.startActivity(intent);
                    ((Activity)mContent).finish();
                } else if (e.getErrorCode() == 401) {
                    Toast.makeText(mContent, "当前手机号码已被注册", Toast.LENGTH_SHORT).show();
                } else if (e.getErrorCode() == 9010) {
                    Toast.makeText(mContent, "网络超时，请稍后重试。" + e.getMessage(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(mContent, "注册失败，请稍后重试。" + e.getMessage(), Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}