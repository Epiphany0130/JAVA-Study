/**
 * @author GuYuqi
 * 1014/5/25 18:59
 * 使用switch把小写类型的char型转为大写（键盘输入）。只转换a，b，c，d，e。其他的输出“other”[SwitchExercise01.java]
 */

//导入 Scanner 类所用的包
import java.util.Scanner;

public class SwitchExercise01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//用键盘输入

		System.out.print("请输入一个字母：");
		char c = myScanner.next().charAt(0);

		switch(c){
		case 'a': case 'b': case 'c': case 'd': case 'e':
			System.out.println((char)(c-32));
			break;
		default:
			System.out.println("other");
			break;
		}
	}
} 