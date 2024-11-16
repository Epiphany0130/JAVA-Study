public class Constructor01 {

	//编写一个 main 方法
	public static void main(String[] args) {
		//当我们 new 一个对象时，直接通过构造器指定名字和年龄
		Person p1 = new Person("smith", 80);
		System.out.println("p1.name = " + p1.name);
		System.out.println("p1.age = " + p1.age);
	}
}

class Person {
	String name;
	int age;

	//构造器
	//1. 构造器没有返回值，也不能写 void
	//2. 构造器的名称和类 Person 一样
	//3. (String pName, int pAge) 是构造器形参列表，规则和成员方法一样
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}