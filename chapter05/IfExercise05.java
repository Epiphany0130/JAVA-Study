/**
 * @author GuYuqi
 * 2024/5/25 18:02
 * 出票系统：根据淡旺季的月份和年龄，打印票价
 * 4-10月旺季：
 * 		成人（18 - 60）：60
 * 		儿童：半价
 * 		老人：1/3
 * 淡季：
 * 		成人：40
 * 		其他：20
 */ 

//导入 Scanner 类所在的包
import java.util.Scanner;

public class IfExercise05 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入月份：");
		int month = myScanner.nextInt();
		System.out.print("请输入年龄：");
		int age = myScanner.nextInt();

		double price;
		if(month >= 4 && month <= 10){

			if(age < 18){
				price = 60 / 2;
			}else if(age <= 60){
				price = 60;
			}else{
				price = 60 / 3;
			}

		}else{

			if(age >= 18 && age <= 60){
				price = 40;
			}else{
				price = 20;
			}
		}

		System.out.println("票价：" + price);
	}
}