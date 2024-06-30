/**
 * @author GuYuqi
 * 2024/5/27 23：00
 * 已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，比如：[10, 12, 45, 90]，添加23后，数组为[10, 12, 23, 45, 90]。[Homework04.java]
 */ 

public class Homework04 {
	
	//编写一个main方法
	public static void main(String[] args) {

		//创建一个数组
		int[] arr = {10, 12, 45, 90};

		//要添加的数
		int num = 23;

		//将数插入 arrNew
		int[] arrNew = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}

		// 空出位置
		int n = 0;
		for (int i = arrNew.length - 2; i >= 0; i--) {
			if(arrNew[i] > num) {
				arrNew[i + 1] = arrNew[i];
				n = i;
			} else {
				break;
			}
		}

		//插入元素
		arrNew[n] = num;

		//改变 arr
		arr = arrNew;

		//输出
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}