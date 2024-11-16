
//数组扩容
public class ArrayAdd {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//定义初始数组
		int[] arr = {1, 2, 3};

		//定义一个新数组
		int[] arrNew = new int[arr.length + 1];

		//遍历arr，依次拷贝
		for (int i = 0; i  < arr.length; i++) {
			arrNew[i] = arr[i];
		}

		//给arrNew赋值
		arrNew[arrNew.length - 1] = 4; 

		//让 arr 指向 arrNew
		arr = arrNew;

		//打印
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}