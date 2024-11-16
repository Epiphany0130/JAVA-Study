package com.hspedu.Interface_;

//Phone 实现 UsbInterface 接口
//1. Phone 类需要 Override UsbInterface 接口的所有抽象方法
public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
