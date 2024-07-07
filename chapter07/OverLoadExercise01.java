/**
 * @author GuYuqi
 * 2024/7/6 13:21
 * 编写程序，类Methods中定义三个重载方法并调用。方法名为m。三个方法分别接收一个 int 参数、两个 int 参数、一个字符串参数。分别执行平方运算并输出结果，相乘冰输出结果，输出字符串信息。在主类的 main() 方法中分别用参数区别调用三个方法
 */
public class OverLoadExercise01 {

	//编写一个 main 方法
	public static void main(String[] args) {
		Methods myMethods = new Methods();
		System.out.println(myMethods.m(2));
		System.out.println(myMethods.m(2, 3));
		myMethods.m("Hello, World!");
	}
} 

class Methods {
	//int 平方
	public int m(int a) {
		return a * a;
	}

	//int 相乘
	public int m(int a, int b) {
		return a * b;
	}

	//输出字符串
	public void m(String c) {
		System.out.println(c);
	}
}