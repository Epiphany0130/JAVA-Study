
//编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁，则输出“你的年龄大于18，要对自己的行为负责，送入监狱”
//导入 scanner 类所在的包
import java.util.Scanner;	//表示把java.util下的Scanner类导入

public class If01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner scanner = new Scanner(System.in);	//从键盘输入

		//让用户输入年龄
		System.out.print("请输入年龄：");
		int age = scanner.nextInt();

		//判断是否符合条件
		if(age > 18)
			System.out.println("你的年龄大于18，要对自己的行为负责，送入监狱");
	}
}