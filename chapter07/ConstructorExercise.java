public class ConstructorExercise {

	//编写一个 main 方法
	public static void main(String[] args) {
		//无参构造器
		Person p1 = new Person();
		System.out.println("p1.name = " + p1.name + " p1.age = " + p1.age);
		//带参数的构造器
		Person p2 = new Person("scott", 50);
		System.out.println("p2.name = " + p2.name + " p2.age = " + p2.age);
	}
}

class Person {
	String name;
	int age;

	//无参
	public Person() {
		age = 18;
	}

	//带两个形参
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}