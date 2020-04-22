package com.coco.aspectj;

import android.app.Application;
import android.content.Context;

import com.coco.aspectjlib.Util;


public class APP extends Application {
    private volatile static APP instance=null;//防止多个线程同时访问
    public static Context sContext;//全局的Context对象

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
        Util.mContext = this;
    }
//应用层的单例模式
    public static APP getInstance() {
        if (instance==null){
            synchronized (APP.class){
                if (instance==null){
                    instance=new APP();
                }
            }
        }
        return instance;
    }
}
