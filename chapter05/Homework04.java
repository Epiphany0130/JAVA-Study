/**
 * @author GuYuqi
 * 2024/5/26 16:33
 * 判断一个整数是否为水仙花数，所谓水仙花数是指一个三位数，其各个位上的数字立方和等于其本身[Homework04.java]
 */ 

//导入 Scanner 类所在的包
import java.util.Scanner;

public class Homework04 {
	
	//编写一个 main 方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入一个三位数：");
		int num = myScanner.nextInt();

		//手动拆分三位数
		int a = num % 10;
		int b = num / 10 % 10;
		int c = num / 100;

		if(a * a * a + b * b * b + c * c * c == num){
			System.out.println("是水仙花数");
		}else{
			System.out.println("不是水仙花数");
		}
	}
}