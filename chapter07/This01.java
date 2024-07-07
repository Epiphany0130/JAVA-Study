public class This01 {

	//编写一个 main 方法
	public static void main(String[] args) {

		Dog dog1 = new Dog("Max", 3);
		dog1.info();
	}
}

class Dog {
	String name;
	int age;

	public Dog(String name, int age) {
		//this.name 就是当前对象的属性 name
		this.name = name;
		//this.age 就是当前对象的属性 age
		this.age = age;
	}

	public void info() {
		System.out.println(name + "\t" + age + "\t");
	}
}