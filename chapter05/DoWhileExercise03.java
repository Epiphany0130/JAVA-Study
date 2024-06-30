/**
 * @author GuYuqi
 * 2024/5/25 20:55
 * 统计1-200之间能被5整除但不能被3整除的个数[DoWhileExercise03.java]
 */ 

public class DoWhileExercise03 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int i = 1, total = 0;
		do{
			if(i % 5 == 0 && i % 3 != 0){
				total++;
			}
			i++;
		}while(i <= 200);
		System.out.println(total);
	}
}