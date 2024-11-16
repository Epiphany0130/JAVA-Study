package com.hspedu.single_;

public class SingleTon01 {

    public static void main(String[] args) {
//        GirlFriend xh = new GirlFriend("小红");
//        GirlFriend xb = new GirlFriend("小白");
        //通过方法获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
    }
}
//有一个类，GirlFriend，只能有一个对象
class GirlFriend{

    private String name;

    //如何保证我们只能创建一个 GirlFriend 对象
    //1. 将构造器私有化
    //2. 在类中创建该类对象
    private static GirlFriend gf = new GirlFriend("小红红");
    private GirlFriend(String name) {
        this.name = name;
    }

    //3. 对外提供一个公共的 static 方法，返回该对象
    public static GirlFriend getInstance(){
        return gf;
    }
    @Override
    public String toString() {
        return "GirlFriend{" + name + '}';
    }
}
