
//编写一个程序，可以输入人的年龄
///如果该同志的年龄大于18岁，则输出“你年龄大于18，要对自己的行为负责，送入监狱”
//否则，输出“你的年龄不够18岁，这次放过你了”

//导入 Scanner 类所在的包
import java.util.Scanner;

public class If02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入年龄：");
		int age = myScanner.nextInt();

		//判断是否符合条件
		if(age > 18){
			System.out.println("你的年龄大于18，要对自己的行为负责，送入监狱");
		}
		else{
			System.out.println("你的年龄不够18岁，这次放过你了");
		}
	}
}