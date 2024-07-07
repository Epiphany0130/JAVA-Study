/**
 * @author GuYuqi
 * 2024/7/7 12:06
 * 编写类 A01，定义方法 max，实现求某个 double 数组的最大值，并返回
 */
public class Homework01 {

	//编写一个 main 方法
	public static void main(String[] args) {
		A01 a = new A01();
		double[] arr = {1.1, 2.2, 3.3};
		System.out.println(a.max(arr));
	}
} 

class A01 {
	public double max(double[] arr) {
		double max = arr[1];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}