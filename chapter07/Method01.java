public class Method01 {	//Method - 方法
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//方法调用
		//先创建对象，再调用方法
		Person p1 = new Person();	//创建对象
		p1.speak();	//调用方法

		//调用 cal01 方法
		p1.cal01();

		//调用 cal02 方法
		p1.cal02(5);
		p1.cal02(10);

		//调用 getSum 方法
		System.out.println(p1.getSum(5, 10)); 
	}
}

class Person{

	String name;
	int age;

	//添加 speak 方法，输出“我是一个好人”
	public void speak() {	//public 表示该方法是公开的
							//void 表示该方法没有返回值
							//speak() speak是方法名 ()是形参列表
		System.out.println("我是一个好人");
	}

	//添加 cal01 方法，计算1 + ... + 100的结果
	public void cal01() {
		int res = 0;
		for (int i = 1; i <= 100; i++) {
			res += i;
		}
		System.out.println("cal01 计算结果 = " + res);
	}

	//添加cal02成员方法，该方法可以接受一个数n，计算从1 + ... + n的结果
	public void cal02(int n) {	//(int n)	//当前有一个形参，可以接受用户输入
		int res = 0;
		for (int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println("cal02 计算结果 = " + res);
	}

	//添加getSum成员方法，可以i计算两个数的和
	public int getSum(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
}