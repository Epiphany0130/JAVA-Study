
//数组拷贝
public class ArrayCopy {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30};

		//创建一个新的数组arr2，开辟新的空间
		//大小 arr1.length
		int[] arr2 = new int[arr1.length];

		//遍历arr1，把每个元素拷贝到对应位置
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		//修改arr2
		arr2[0] = 100;

		//输出
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println(" ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}