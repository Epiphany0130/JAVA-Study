/**
 * @author GuYuqi
 * 2024/5/26 12:42
 * 实现登录验证，有3次机会，如果用户名为“丁真”，密码“666”提示登录成功，否则提示还有几次机会。[BreakExercise02.java]
 */ 

//导入 Scanner 类所在的包
import java.util.Scanner;

public class BreakExercise02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);

		String name = "";
		String passwd = "";
		int chance = 3;
		for (int i = 1; i <= 3; i++) {
			System.out.println("请输入名字：");	
			name = myScanner.next();
			System.out.println("请输入密码：");
			passwd = myScanner.next();

			//比较输入的名字和密码是否正确
			//字符串内容比较 使用的方法 equals
			if("丁真".equals(name) && "666".equals(passwd)){
				System.out.println("登录成功");
				break;
			}

			//登录的机会减少
			chance--;
			System.out.println("你还有" + chance + "次机会");
		}
	}
}