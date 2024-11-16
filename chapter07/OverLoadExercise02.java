/**
 * @author GuYuqi
 * 2024/7/6 13:30
 * 在 Methods 类，定义三个重载方法 max()，第一个方法，返回两个 int 值中的最大值，第二个方法，返回两个 double 值中的最大值，第三个方法，返回三个 double 值中的最大值，并分别调用三个方法
 */
public class OverLoadExercise02 {

	//编写一个 main 方法
	public static void main(String[] args) {
		Methods myMethods = new Methods();
		System.out.println(myMethods.max(2, 3));
		System.out.println(myMethods.max(2.2, 3.3));
		System.out.println(myMethods.max(6.6, 5.5, 4.4));
	}
}

class Methods {

	//返回两个 int 中大的
	public int max(int a, int b) {
		return a > b ? a : b;
	}

	//返回两个 double 中大的
	public double max(double a, double b) {
		return a > b ? a : b;
	}

	//返回三个 double 中大的
	public double max(double a, double b, double c) {
		return a > b ? a : b > c ? b : c;
	}
}