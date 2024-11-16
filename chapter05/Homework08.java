/**
 * @author GuYuqi
 * 2024/5/26 16:54
 * 求 1 + （1 + 2） + （1 + 2 + 3） + （1 + 2 + 3 +4） + ... + （1 + 2 + 3 + ... + 100）的结果[Homework08.java] 
 */ 
public class Homework08 {
	  
	//编写一个 main 方法
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			int sum1 = 0;
			for (int j = 1; j <= i; j++) {
				sum1 += j;
			}
			sum += sum1;
		}
		System.out.println("1 + （1 + 2） + （1 + 2 + 3） + （1 + 2 + 3 +4） + ... + （1 + 2 + 3 + ... + 100） = " + sum);		
	}
}