/**
 * @author GuYuqi
 * 2024/5/25 20:37
 * 打印40-200之间所有偶数，使用while。[WhileExercise02.java]
 */ 

public class WhileExercise02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int i = 40;
		while(i <= 200){
			if(i % 2 == 0){
				System.out.println(i + " ");
			}
			i++;
		}
	}
}