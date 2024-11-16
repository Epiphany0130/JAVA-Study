
public  class ArrayReverse02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int[] arr = {11, 22, 33, 44, 55, 66};

		//建立数组 arr2
		int[] arr2 = new int[arr.length];

		//逆序复制
		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[i] = arr[arr.length - i - 1];
		}

		//打印
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
} 