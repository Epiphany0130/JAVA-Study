public class RecursionExercise01 {

	//编写一个 main 方法
	public static void main(String[] args) {
		T t1 = new T();
		System.out.println(t1.fib(7));
	}
}

class T {
	public int fib(int n) {
		if(n == 1 || n == 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
}