/**
 * @author GuYuqi
 * 2024/5/26 10:59
 * 打印九九乘法表[MulForExercise03.java]
 */ 

public class MulForExercise03 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++){
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + '\t');
			}
			System.out.print('\n');
		}
	}
}