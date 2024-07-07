/**
 * @author GuYuqi
 * 2024/7/7 13:15
 * 编程创建一个 Cale 计算类，在其中定义两个操作数，定义四个方法实现求和、差、乘、商（要求除数为0的话，要提示）并创建两个对象，分别测试
 */
public class Homework06 {

	//编写一个 main 方法
	public static void main(String[] args) {

		//new 对象
		Cale c = new Cale(1, 0);
		System.out.println(c.add() + " " + c.subtract() + " " + c.multiply() + " " + c.divide());
	}
}  

class Cale {

	double n1;
	double n2;

	//构造器
	public Cale(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	//和 方法
	public double add() {
		return n1 + n2;
	}

	//差 方法
	public double subtract() {
		return n1 - n2;
	}

	//乘 方法
	public double multiply() {
		return n1 * n2;
	}

	public double divide() {
		if(n2 == 0) {
			System.out.println("分母为 0，除法无结果");
			return 0;
		} else {
			return n1 / n2;
		}
	}
}