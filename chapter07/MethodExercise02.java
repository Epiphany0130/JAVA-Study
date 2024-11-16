//根据行、列、字符打印对应行数和列数的字符，比如：行：4，列：4，字符：#。则打印相应的效果[MethodExercise02.java]

//引入 Scanner 类所在的包
import java.util.Scanner;

public class MethodExercise02 {

	//编写一个 main 方法
	public static void main(String[] args) {

		AA a = new AA();
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入行数：");
		int hang = myScanner.nextInt();
		System.out.print("请输入列数：");
		int lie = myScanner.nextInt();
		System.out.print("请输入字符");
		char ziFu = myScanner.next().charAt(0);

		a.print(hang, lie, ziFu);
	}
}

//编写一个类 AA 
class AA {
	
	//编写一个方法
	public void print(int hang, int lie, char ziFu) {
		for (int i = 0; i < hang; i++) {
			for (int j = 0; j < lie; j++) {
				System.out.print(ziFu);
			}
			System.out.println();
		}
	}
}