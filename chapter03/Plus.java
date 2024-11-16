
//验证加号在程序中的作用
public class Plus{

	//编写一个main方法
	public static void main(String[] args){

		//测试加号作用
		System.out.println(100 + 3);			//103
		System.out.println("100" + 3);			//1003
		System.out.println(100 + 3 + "hello");	 //103hello
		System.out.println("hello" + 100 + 3);	 //hello1003
	}
}