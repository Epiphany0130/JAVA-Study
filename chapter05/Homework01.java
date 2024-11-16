/**
 * @author GuYuqi
 * 2024/5/26 16:16
 * 编程实现如下功能[Homework01.java]某人有100000元，每经过一次路口，需要交费，规则如下：
 * 1）当现金>50000时，每次交5%
 * 2）当现金<=50000时，每次交1000
 * 编程计算该人可以经过多少次路口，要求：使用while break方式完成
 */ 

public class Homework01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		double money = 100000;	//一共有100000元
		int total = 0;	//计数器
		while(money > 1000){

			//判断金额并扣款
			if(money > 50000){
				money = money - (money * .05);
			}else{
				money -= 1000;
			}
			total++;
		}
		System.out.println("可以经过路口" + total + "次");
	}
}