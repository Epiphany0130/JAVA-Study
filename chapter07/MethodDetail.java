public class MethodDetail {

	//编写一个 main 方法
	public static void main() {

		AA a = new AA();
		int[] res = a.getSumAndSub(1, 4);
		System.out.println("和=" + res[0]);
		System.out.println("差=" + res[1]);
	}
}

class AA {
	public int[] getSumAndSub(int n1, int n2) {

		int[] resArr = new int[2];	//创建一个数组
		res[0] = n1 + n2;
		res[1] = n1 - n2;
		return resArr;
	}
}