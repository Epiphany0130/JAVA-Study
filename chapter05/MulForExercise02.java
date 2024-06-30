/**
 * @author GuYuqi
 * 2024/5/26 10:51
 * 统计三个班及格人数，每个班有5名同学[MulForExercise02.java]
 */ 

//导入 Scanner 类所在的包
import java.util.Scanner;

public class MulForExercise02 {
	
	//编写一个main函数
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);

		int total = 0, score;
		for (int cla = 0; cla < 3; cla++) {
			System.out.println("请输入第" + (cla + 1) + "个班同学的成绩：");
			for (int stu = 0; stu < 5; stu++) {
				score = myScanner.nextInt();
				if(score > 60){
					total++;
				}
			}
		}
		System.out.println("三个班及格的人数是：" + total);
	}
}