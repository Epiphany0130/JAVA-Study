
//二维数组输出图形
public class TwoDimensionalArray01 {	//Two - 二
										//Dimensional - 维度
										//Array - 数组
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//定义形式 int[][]
		//可以理解为，原来的一维数组的每个元素是一维数组，就构成二维数组
		int[][] arr = {{0, 0, 0, 0, 0, 0}, 
					   {0, 0, 1, 0, 0, 0}, 
					   {0, 2, 0, 3, 0, 0}, 
					   {0, 0, 0, 0, 0, 0}};

		for (int i = 0; i < arr.length; i++) {	//遍历二维数组的每个元素 - 一维数组
			for (int j = 0; j < arr[i].length; j++) {	//遍历二维数组的每个一维数组的长度
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}