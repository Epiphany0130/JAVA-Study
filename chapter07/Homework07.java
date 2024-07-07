/**
 * @author GuYuqi
 * 2024/7/7 13:26
 * 设计一个 Dog 类，有名字、颜色和年龄属性，定义输出方法 show() 显示其信息。并创建对象，进行测试
 */
public class Homework07 {

	//编写一个 main 方法
	public static void main(String[] args) {

		//new 对象
		Dog d = new Dog("Mix", "white", 3);

		//调用方法
		d.show();
	}
}  

class Dog {

	//定义属性
	String name;
	String color;
	int age;

	//构造器
	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	//输出 方法
	public void show() {
		System.out.println(name + " " + color + " " + age);
	}
}