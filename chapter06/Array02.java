
//使用动态初始化定义数组

//导入 Scannr 类所在的包
import java.util.Scanner;

public class Array02{

	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		double[] score = new double[5];

		//遍历 输入
		for(int i = 0; i < score.length; i++){
			System.out.print("请输入第" + (i + 1) + "个元素的值：");
			score[i] = myScanner.nextDouble();
		}

		//遍历 输出
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
	}
}