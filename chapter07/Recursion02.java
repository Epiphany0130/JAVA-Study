public class Recursion02 {

	//编写一个 main 方法
	public static void main(String[] args) {
		T t1 = new T();
		System.out.println(t1.factorial(5));
	}
}

class T {
	public int factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}
}