
//动态初始化
public class TwoDimensionalArray03 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int[][] arr;	//先声明
		arr = new int[2][3];	//再开空间

		//遍历arr
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	} 
}