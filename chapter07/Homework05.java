/**
 * @author GuYuqi
 * 2024/7/7 13:06
 * 定义一个圆类Circle，定义属性：半径，提供显示圆周长功能的方法，提供显示圆面积的方法
 */
public class Homework05 {

	//编写一个 main 方法
	public static void main(String[] args) {
		Circle c = new Circle(3);
		System.out.println("c = " + c.c() + " s = " + c.s());
	}
} 

class Circle {
	double r;

	//构造器
	public Circle(double r) {
		this.r = r;
	}

	//周长 方法
	public double c() {
		return 2 * Math.PI * r;
	}

	//面积 方法
	public double s() {
		return Math.PI * r * r;
	}
}