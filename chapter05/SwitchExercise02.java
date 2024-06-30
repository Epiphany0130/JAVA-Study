/**
 * @author GuYuqi
 * 2024/5/25 19:05
 * 对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。（注：输入的成绩不能大于100）。提示，成绩 / 60[SwitchExercise02.java]
 */

//导入 Scanner 所用的包
import java.util.Scanner;

public class SwitchExercise02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);

		System.out.print("输入成绩：");
		int score = myScanner.nextInt();

		score /= 60;
		switch(score){
		case 0:
			System.out.println("不合格");
			break;
		default:
			System.out.println("合格");
			break;
		}
	}
} 