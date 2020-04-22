package com.coco.aspectj;

import android.util.Log;

/**
 * @author hiphonezhu@gmail.com
 * @version [AspectJDemo, 17/1/20 10:10]
 */

public class Animal {
    private static final String TAG = "Animal";
    static {
        Log.e(TAG, "static block");
    }

    private int age;

    public Animal() {
        Log.e(TAG, "Animal构造函数");
        this.age = 10;
        Log.e(TAG, "Animal构造函数 age"+ age);
    }

    public void fly() {
        Log.e(TAG, this.toString() + "#fly");
    }

    public int getAge() {
        Log.e(TAG, "getAge: "+this.age);
        return this.age;
    }

    public void setAge(int age) {
        Log.e(TAG, "setAge: ");
        this.age = age;
    }

    public int getWeight() {
        Log.e(TAG, "getWeight: " + 60);
        return 60;
    }

    public void hurt() {
        try {
            int i = 4 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            Log.e(TAG, e.getMessage());
        }
    }

    public void hurtThrows(){
        int i = 4 / 0;
    }

    public int getHeight() {
        return 10;
    }

    public boolean getTest(int n){
        return false;
    }

    public int getHeight(int sex) {
        switch (sex) {
            case 0:
                return 163;
            case 1:
                return 173;
        }
        return 173;
    }

    public void targetFunc() {

    }
}
