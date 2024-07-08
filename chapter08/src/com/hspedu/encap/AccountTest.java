/**
 * @author GuYuqi
 * 2024/7/8 23:16
 * 创建程序，在其中定义两个类：Account 和 AccountTest 类体会 Java 的封装性
 *
 * 1. Account 类要求具有属性：姓名（长度为2、3、4位）、余额（必须 >20）、密码（必须是六位），如果不满足，则给出提示信息，并给默认值
 * 2. 通过 setXxx 的方法给 Account 的属性赋值
 * 3. 在 AccountTest 中测试
 */
package com.hspedu.encap;

public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account("Jack", 30, "060130");
        System.out.println(account.info());
    }
}
