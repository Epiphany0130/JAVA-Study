/**
 * @author GuYuqi
 * 2024/5/25 20:11
 * 打印1-100之间所有是9的倍数的整数，统计个数及总和[ForExercise01.java]
 */ 

public class ForExercise01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int total = 0, sum = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 9 == 0){
				total++;
				sum += i;
			}
		}
		System.out.println("个数：" + total + '\n' + "总和：" + sum);
	}
}