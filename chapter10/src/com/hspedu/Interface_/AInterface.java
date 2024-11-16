package com.hspedu.Interface_;

public interface AInterface {
    //写属性
    public int n1 = 10;
    //写方法
    //在接口中，抽象方法可以省略 abstract 关键字
    public void hi();

    default public void ok(){
        System.out.println("ok()");
    }
}
