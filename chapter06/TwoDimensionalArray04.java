
//动态初始化
public class TwoDimensionalArray04 {
	
	//编写一个main方法
	public static void main(String[] args) {

		/*
			i = 0:	1
			i = 1:	2  2
			i = 2:	3  3  3
		*/		

		int[][] arr = new int[3][];	//列数不确定，所以列数不写
		for (int i = 0; i < arr.length; i++) {	//遍历 arr 的每一个一维数组
			//给每个一维数组开空间
			arr[i] = new int[i + 1];	//如果没有给一维数组 new，那么，arr[i] 就是 null

			//遍历一维数组，并给每个元素赋值
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;
			}
		}

		//遍历输出
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	} 
}