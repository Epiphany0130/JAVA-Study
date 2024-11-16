/**
 * @author GuYuqi
 * 2024/5/25 14:25
 * 输入保国同志的芝麻信用分:
 * 如果：
 * 1. 信用分为100分时，输出 信用极好
 * 2. 信用分为(80,99]时，输出 信用优秀
 * 3. 信用分为[60,80]时，输出 信用一般
 * 4. 其他情况，输出 信用不及格
 * 5. 从键盘输入保国的芝麻信用分，并加以判断
 */  

//导入 Scanner 类所在的包
import java.util.Scanner;

public class IfExercise04 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("输入芝麻信用分：");
		int score = myScanner.nextInt();

		//判断条件
		if(score >= 0 && score <= 100){
			if(score == 100){
				System.out.println("信用极好");
			}else if(score > 80 && score <= 90){
				System.out.println("信用优秀");
			}else if(score >= 60 && score <= 80){
				System.out.println("信用一般");
			}else
				System.out.println("信用不及格");
			}
		}else{
			System.out.println("信用分需要在0-100，请重新输入！");
		}
}