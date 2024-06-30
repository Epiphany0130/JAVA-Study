/**
 * @author GuYuqi
 * 2024/5/25 20:20
 * 完成下列输出[ForExercise02.java]
 * 0 + 5 = 5
 * 1 + 4 = 5
 * 2 + 3 = 5
 * 3 + 2 = 5
 * 4 + 1 = 5
 * 5 + 0 = 5
 */ 

public class ForExercise02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		for(int i = 0; i <= 5; i++){
			System.out.println(i + "+" + (5 - i) + "=5" );
		}
	}
}