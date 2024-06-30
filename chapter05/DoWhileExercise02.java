/**
 * @author GuYuqi
 * 2024/5/25 20:52
 * 计算1-100的和[DoWhileExercise.java]
 */ 

public class DoWhileExercise02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int i = 1, sum = 0;
		do{
			sum += i;
			i++;
		}while(i <= 100);
		System.out.println("1 + 2 + 3 + ... + 100 = " + sum);
	}
}