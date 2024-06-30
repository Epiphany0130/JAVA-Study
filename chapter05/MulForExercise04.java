/**
 * @author GuYuqi
 * 2024/5/26 11:04
 * 打印金字塔[MulForExercise04.java]
 */ 

public class MulForExercise04 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++){
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}
}