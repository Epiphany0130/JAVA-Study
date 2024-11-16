public class VarScope {

	//编写一个 main 方法
	public static void main(String[] args) {

	}
}

class Cat {

	//局部变量：也就是除了属性以外的其他变量，作用域为定义它的代码块中
	//属性在定义时，可以直接赋值
	int age = 10;

	//全局变量（属性）可以不赋值，直接使用，因为有默认值
	double weight;	//没赋值，有默认值 0.0

	public void hi() {
		//局部变量必须赋值后才能使用，因为没有默认值
		int num;
		System.out.println("num = " + num);	//错误，num 没有赋值
	}

	public void cry() {

		//局部变量一般是指在成员方法中定义的变量
		//n 和 name 是局部变量，作用域在 cry 方法中
		int n = 10;
		String name = "jack";
		//在 cry 方法中使用 age
		System.out.println("age = " + age);
	}

	{
		int num = 100;	//num 只能在代码块中使用，不能在 cry 和 eat 方法中使用
	}

	public void eat() {
		//在 eat 方法中使用 age
		System.out.println("age = " + age);

		System.out.println("name = " + name);	//错误，name 在 cry 中

	}
}