public class MethodParmeter02 {

	//编写一个 main 方法
	public static void main(String[] args) {

		B b = new B();
		int[] arr = {1, 2, 3};
		b.test100(arr);
		System.out.println("main 的 arr 数组：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

		Person p = new Person();
		p.name = "jack";
		p.age = 10;

		b.test200(p);
		System.out.println("main 的 p.age = " + p.age);
	}
}

class Person {
	String name;
	int age;
}

class B {

	public void test200(Person p) {
		p.age = 10000;
		// p = null;
	}

	public void test100(int[] arr) {
		arr[0] = 200;
		System.out.println("test100 的 arr 数组：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}