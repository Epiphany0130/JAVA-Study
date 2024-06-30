public class MethodExercise03 {

	//编写一个 main 方法
	public static void main(String[] args) {

		Person p = new Person();
		p.name = "milan";
		p.age = 100;
		//创建tools对象
		MyTools tools = new MyTools();
		Person p2 = tools.copyPerson(p);
		//到此，p 和 p2 都是Person对象，但是两个独立的对象，属性相同
		System.out.println("p 的属性 age = " + p.age + " 名字 = " + p.name);
		System.out.println("p2 的属性 age = " + p2.age + " 名字 = " + p2.name);
		
		//通过对象比较看看是否为同一个对象
		System.out.println(p == p2);
	}
}

class Person {
	String name;
	int age;
}

class MyTools {

	public Person copyPerson(Person p) {
		//创建一个新对象
		Person p2 = new Person();
		p2.name = p.name;	//把原来对象的名字赋给p2.name
		p2.age = p.age;		//把原来对象的年龄赋给p2.age

		return p2;
	}
}