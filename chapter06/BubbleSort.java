//升序

public class BubbleSort {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int[] arr = {24, 69, 80, 57, 13};
		int temp = 0;	//交换 临时变量

		for (int i = 0; i < arr.length - 1; i++) {
			
			for (int j = 0; j < arr.length - 1 - i; j++) {	//4次比较
			//如果前面的数大于后面的数，交换
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
 			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}