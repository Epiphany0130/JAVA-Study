public class MethodParmeter01 {

	//编写一个 main 方法
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		//创建AA对象，名字obj
		AA obj = new AA();
		obj.swap(a, b);	//调用swqp

		System.out.println("\nmain 方法\na = " + a + " b = " + b);//a = 10, b = 20

	} 
}

class AA {
	public void swap(int a, int b) {
		System.out.println("\na和b交换前的值\na = " + a + "\tb = " + b);
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("\na和b交换后的值\na = " + a + "\tb = " + b);	
	}
}