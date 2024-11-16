package com.hspedu.abstract_;

public class BB extends Template {


    public void job() {

        int sum = 0;
        for (int i = 1; i <= 800000; i++) {
            sum *= i;
        }

    }
}
