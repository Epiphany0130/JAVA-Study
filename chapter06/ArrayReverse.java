
//数组反转
public class ArrayReverse {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//定义数组
		int[] arr = {11, 22, 33, 44, 55, 66};

		//规律
		//1. 把 arr[0] 和 arr[5] 进行交换 {66, 22, 33, 44, 55, 11}
		//2. 把 arr[1] 和 arr[4] 进行交换 {66, 55, 33, 44, 22, 11}
		//3. 把 arr[2] 和 arr[3] 进行交换 {66, 55, 44, 33, 22, 11}
		//一共要交换的次数 = arr.length / 2
		//每次交换，对应的下标是 arr[i] 和 arr[arr.length - 1 - i] 

		for(int i = 0; i < arr.length / 2; i++){
			int temp = arr[arr.length - i - 1];	//保存
			arr[arr.length - i - 1] = arr[i];
			arr[i] = temp;
		}

		/*
			优化
			int temp = 0;
			int len = arr.lenth;
			for(int i = 0; i < len / 2; i++){
			temp = arr[len - i - 1];	//保存
			arr[len - i - 1] = arr[i];
			arr[i] = temp;
		}
		*/

		//打印
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}