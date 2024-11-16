/**
 * @author GuYuqi
 * 2024/5/25 14:12
 * 判断一个年份是否为闰年，闰年的条件是符合下面二者之一：1） 年份能被4整除，但不能被100整除 2） 能被400整除。[IfExcercise03.java]
 */ 

//导入 Scanner 类所在的包
import java.util.Scanner;

public class IfExercise03 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入一个年份：");
		int year = myScanner.nextInt();

		//判断条件
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println("该年份是闰年");
		}
		else{
			System.out.println("该年份不是闰年");
		}
	}
}