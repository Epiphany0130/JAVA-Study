/**
 * @author GuYuqi
 * 2024/5/26 16:27
 * 判断一个年份是否为闰年[Homework03.java]
 */ 

//导入 Scanner 类所在的包
import java.util.Scanner;

public class Homework03 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);

		System.out.print("请输入一个年份：");
		int year = myScanner.nextInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println("是闰年");
		}else{
			System.out.println("不是闰年");
		}
	}
}