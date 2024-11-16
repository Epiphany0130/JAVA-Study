/*
	张老太太养了两只猫：
	一只叫小白，今年三岁，白色
	另一只叫小花，今年一百岁，花色
	编写程序，当用户输入小猫的名字时，就显示名字、年龄、颜色
	如果输入小猫名错误，则显示 张老太太没有这只猫
*/

//已有技术解决
public class Object01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
	/*	

		//单独变量解决 -> 不利于数据管理
		//第一只猫信息
		String cat1Name = "小白";
		int cat1Age = 3;
		String cat1Color = "白色";

		//第二只猫信息
		String cat1Name = "小花";
		int cat1Age = 100;
		String cat1Color = "花色";

		//数组 -> 1.  数据类型无法体现 
		//		  2. 只能通过下标获取信息，造成变量名与内容对应不明确
		//		  3. 不能体现猫的行为
		//第1只猫信息
		String[] cat1 = {"小白", "3", "白色"};
		String[] cat2 = {"小花", "100", "花色"};
	}

	*/

		//使用OOP面向对象解决
		//实例化一只猫
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";

		//创建第二只猫，并赋给 cat2
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";

		//使用对象属性
		System.out.println("第一只猫的信息：" + cat1.name + " " + cat1.age + " " + cat1.color);
		System.out.println("第二只猫的信息：" + cat2.name + " " + cat2.age + " " + cat2.color);
	}
}

//面向对象解决
//定义一个猫类 Cat -> 自定义的数据类型
class Cat {
	//属性
	String name;	//名字
	int age;		//年龄
	String color;	//颜色
}