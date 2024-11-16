/**
 * @author GuYuqi
 * 2024/5/26 16:49
 * 求出1 - 1/2 + 1/3 - 1/4 ... 1/100[Homework07.java]
 */ 

public class Homework07 {
	
	//编写一个 main 方法
	public static void main(String[] args) {
		
		//状态判断符号轮转
		int f = 1;
		double sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + (1. / i) * f;
			f = -f;
		}
		System.out.println("1 - 1/2 + 1/3 - 1/4 ... 1/100 = " + sum);
	}
}