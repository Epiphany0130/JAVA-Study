/**
 * @author GuYuqi
 * 2024/5/26 16:23
 * 实现判断一个整数，属于哪个范围：大于0；小于0；等于0[Homework02.java]
 */ 

//导入 Scanner 类所在的包
import java.util.Scanner;

public class Homework02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入一个数：");
		int num = myScanner.nextInt();

		if(num > 0){
			System.out.println("大于0");
		}else if(num < 0){
			System.out.println("小于0");
		}else{
			System.out.println("等于0");
		}

	}
}