/**
 * @author GuYuqi
 * 2024/5/26 12:35
 * 1-100以内的数求和，求出当和第一次大于20的当前数[BreakExercise01.java]
 */ 

public class BreakExercise01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int i, sum = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
			if(sum > 20){
				break;
			}
		}
		System.out.println(i);
	}
}