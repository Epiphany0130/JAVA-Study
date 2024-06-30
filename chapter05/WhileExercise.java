/**
 * @author GuYuqi
 * 2024/5/25 20:33
 * 打印1-100之间所有能被3整除的数，使用while。[WhileExercise.java]
 */ 

public class WhileExercise {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 100){
			if(i % 3 == 0){
				System.out.print(i + " ");
			}
			i++;
		}
	}
}