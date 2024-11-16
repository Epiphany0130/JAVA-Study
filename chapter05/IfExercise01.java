/**
 * @author GuYuqi
 * 2024/5/25 13:56
 * 编写程序，声明两个double型变量并复制。判断第一个数大于10.0，且第二个数小于20.0，打印两数之和。[IfExercise01.java]
 */

//导入 Scanner 类所在的包
import java.util.Scanner;

public class IfExercise01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入第一个数：");
		double num1 = myScanner.nextDouble();
		System.out.print("请输入第二个数：");
		double num2 = myScanner.nextDouble();

		//判断条件
		if(num1 > 10.0 && num2 < 20.0){
			System.out.println("num1 + num2 = " + (num1 + num2));
		}
	}
} 