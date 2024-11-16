package com.hspedu.single_;

public class SingleTon02 {
    public static void main(String[] args) {
        Cat cat1 = Cat.getInstance();
        System.out.println(cat1);
    }
}

//希望在程序运行过程中，只能创建一个 Cat 对象，使用单例模式
class Cat {
    private String name;
    private static Cat cat;
    //1.私有化类的构造器
    //2.定义一个 static 静态属性对象
    private Cat(String name) {
        this.name = name;
    }
    //3.提供一个 public 的 static 方法，返回一个 Cat 对象
    public static Cat getInstance() {
        if(cat == null) {
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}