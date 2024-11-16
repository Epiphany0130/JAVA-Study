/**
 * @author GuYuqi
 * 2024/5/27 22:05
 * 遍历下面的二维数组，并得到和[TwoDimensionalArray05.java]
 * int[][] arr = {{4, 6}, {1, 4, 5, 7}, {-2}};
 */ 

public class TwoDimensionalArray05 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//定义数组
		int[][] arr = {{4, 6}, {1, 4, 5, 7}, {-2}};

		//遍历求和
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}

		//输出
		System.out.println(sum);
	}
}
	
