//编写类AA，有一个方法：判断一个数是奇数还是偶数，返回boolean[MethodExercise01.java]
public class MethodExercise01 {

	//编写一个 main 方法
	public static void main(String[] args) {

		AA a = new AA();
		boolean b = a.isOdd(4);
		System.out.println(b);
	}
}

//编写一个类AA
class AA {

	//编写一个方法，判断奇偶数
	public boolean isOdd(int num) {
		//return num % 2 != 0 ? true : false;
		return num % 2 != 0;
	}
}