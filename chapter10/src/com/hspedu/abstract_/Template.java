package com.hspedu.abstract_;

abstract public class Template {

    public abstract void job(); //抽象方法

    public void calculateTime() {   //实现方法，调用 job
        //得到开始的时间
        long start = System.currentTimeMillis();
        job();
        //得到结束的时间
        long end = System.currentTimeMillis();
        System.out.println("任务耗时：" + (end - start));
    }
}
