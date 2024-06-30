/**
 * @author GuYuqi
 * 2024/5/25 14:03
 * 定义两个变量int，判断二者的和，是否能被3又能被5整除，打印提示信息。[IfExercise02.java]
 */ 

//导入 Scanner 类所在的包
import java.util.Scanner;

public class IfExercise02  {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入第一个数：");
		int num1 = myScanner.nextInt();
		System.out.print("请输入第二个数：");
		int num2 = myScanner.nextInt();

		//判断条件
		if((num1 + num2) % 3 == 0 && (num1 + num2) % 5 == 0)
			System.out.println("两数之和可以同时被3和5整除");
		else
			System.out.println("两数之和不能同时被3和5整数");
	}
}