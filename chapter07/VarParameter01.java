public class VarParameter01 {

	//编写一个 main 方法
	public static void main(String[] args) {
		HspMethod myHspMethod = new HspMethod();
		System.out.println(myHspMethod.sum(1, 2, 3));
	}
}

class HspMethod {
	//方法重载
	/*
	public int sum(int n1, int n2) {	//2 个数的和
		return n1 + n2;
	}
	public int sum(int n1, int n2, int n3) {	//3 个数的和
		return n1 + n2 + n3;
	}
	public int sum(int n1, int n2, int n3, int n4) {	//4 个数的和
		return n1 + n2 + n3 + n4;
	}
	*/
	//......

	//封装（可变参数优化）
	public int sum(int... nums) {	//int... - 可变参数，类型 int 可以接收多个
									//使用时可以当做数组来使用
									//即 nums 可以当做数组
		System.out.println("接受的参数个数" + nums.length);
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}
}