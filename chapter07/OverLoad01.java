public class OverLoad01 {

	//编写一个 main 方法
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1.1, 2));
	}
}

class MyCalculator {	//calculate - 计算
	//下面四个 calculate 方法构成了重载
	//两个整数的和
	public int calculate(int n1, int n2) {
		return n1 + n2;
	}			

	//一个整数，一个double的和
	public double calculate(int n1, double n2) {
		return n1 + n2;
	}

	//一个double，一个int和
	public double calculate(double n2, int n1) {
		return n1 + n2;
	}

	//三个int的和
	public int calculate(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
}