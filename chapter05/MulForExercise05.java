/**
 * @author GuYuqi
 * 2024/5/26 11:04
 * 打印金字塔[MulForExercise05.java]
 */ 

public class MulForExercise05 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		for(int i = 1; i <= 6; i++){
			for (int j = 6; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}
}