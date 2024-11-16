/**
 * @author GuYuqi
 * 2024/5/25 19:10
 * 根据用于置顶月份，打印该月所属的季节。3,4,5春6,7,8夏9,10,11秋12,1,2冬[SwitchExercise03.java]
 */ 

//导入 Scanner 所用的包
import java.util.Scanner;

public class SwitchExercise03 {
	
	//编写一个mian方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入月份：");
		int month = myScanner.nextInt();

		switch(month){
		case 3: case 4: case 5:
			System.out.println("春天");	
			break;
		case 6: case 7: case 8:
			System.out.println("夏天");
			break;
		case 9: case 10: case 11:
			System.out.println("秋天");	
			break;
		case 12: case 1: case 2:
			System.out.println("冬天");
			break;
		}
	}
}