/**
 * @author GuYuqi
 * 2024/6/30 14:20
 * 猴子吃桃问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后每天猴子都吃其中的一半，然后再多吃一个。当到第10天时，想再吃时（即还没吃），发现只有1个桃子了。问题：最初共有多少个桃子
 */

public class RecursionExercise02 {

	//编写一个 main 方法
	public static void main(String[] args) {

		T t1 = new T();
		System.out.println("第一天有 " + t1.test100(10) + " 个桃子");
	}
}  

class T {
	public int test100(int n) {
		if(n == 1) {
			return 1;
		} else {
			return (test100(n - 1) + 1) * 2;
		}
	}
}