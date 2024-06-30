//编写一个程序，该程序可以接收一个字符，比如：a,b,c,d,e,f,g
//a表示星期一，b表示星期二
//根据用户的输入显示相依的信息，要求使用switch语句完成

//导入 Scanner 类所在的包
import java.util.Scanner;

public class Switch01 {

	//编写一个main方法
	public static void main(String[] args) {
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入a-g的一个字母：");
		char c = myScanner.next().charAt(0);

		switch(c){
		case 'a':
			System.out.println("星期一");	break;
		case 'b':
			System.out.println("星期二");	break;
		case 'c':
			System.out.println("星期三");	break;
		case 'd':
			System.out.println("星期四");	break;
		case 'e':
			System.out.println("星期五");	break;
		case 'f':
			System.out.println("星期六");	break;
		case 'g':
			System.out.println("星期天");	break;
		default:
			System.out.println("输入错误");	break;
		}
	}
}