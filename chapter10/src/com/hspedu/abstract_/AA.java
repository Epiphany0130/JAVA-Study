package com.hspedu.abstract_;

public class AA extends Template {
    //计算任务
    //1 + ... + 10000
    public void job() {

        int sum = 0;
        for (int i = 1; i <= 8000000; i++) {
            sum += i;
        }

    }
}
