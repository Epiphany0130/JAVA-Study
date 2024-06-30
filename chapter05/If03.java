//参加歌手比赛，如果初赛成绩大于8.0进入决赛，否则提示淘汰
//并且根据性别提示进入男子组和女子组
//输入成绩和性别，进行判断和输出信息

//导入 Scanner 类所在的包
import java.util.Scanner;

public class If03 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("输入成绩：");
		double score = myScanner.nextDouble();

		if(score > 8.0){
			System.out.print("输入性别：");
			char gender = myScanner.next().charAt(0);	//先接收字符串，然后取字符串的第一个字符
			
			if(gender == '男'){
				System.out.println("进入男子组决赛");
			}else if(gender == '女'){
				System.out.println("进入女子组决赛");
			}else{
				System.out.println("性别输入错误，不能参加比赛");
			}

		}else{
			System.out.println("淘汰");
		}
		
	}
}