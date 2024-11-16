/**
 * @author GuYuqi
 * 2024/7/7 12:54
 * 编写类 A03，实现数组的复制功能 copyArr，输入旧数组，返回一个新数组，元素和旧数组一样
 */

//引入 Scanner 类所在的包
import java.util.Scanner;

public class Homework04 {

	//编写一个 main 方法
	public static void main(String[] args) {

		//new 对象
		A03 a = new A03();
		//输入数组
		Scanner myScanner = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = myScanner.nextInt();
		}
		//复制数组
		int[] copy = new int[10];
		copy = a.copyArr(arr);
		//输出数组
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
	}
}  

class A03 {

	//定义对象
	public int[] copyArr(int[] arr) {
		int[] copy = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		return copy;
	}
}