package com.hspedu.Interface_;

public class Computer {
    // 编写一个方法，计算机工作
    public void work(UsbInterface usbInterface) {
        usbInterface.start();
        usbInterface.stop();
    }
}
