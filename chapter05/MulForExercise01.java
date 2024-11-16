/**
 * @author GuYuqi
 * 2024/5/25 21:06
 * 统计3个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分。[MulForExercise01.java]
 */ 

//引入 Scanner 类所用的包
import java.util.Scanner;

public class MulForExercise01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		double avg = 0, score;
		for (int cla = 0; cla < 3; cla++) {
			System.out.println("请输入第" + (cla + 1) + "个班的同学的成绩：");
			avg = 0;
			for (int stu = 0; stu < 5; stu++) {
				score = myScanner.nextInt();
				avg += score;
			}
			System.out.println((cla + 1) + "班的平均分：" + (avg / 5));
		}
	}
}