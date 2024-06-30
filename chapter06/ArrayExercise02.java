/**
 * @author GuYuqi
 * 2024/5/27 15:43
 * 请求出一个数组int[]的最大值{4, -1, 9, 10, 23}，并得到对应的下标[ArrayExercise02.java]
 */ 

public class ArrayExercise02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//定义数组
		int[] a = {4, -1, 9, 10, 23};

		//找最大
		int max = a[0], m = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max){
				max = a[i];
				m = i;
			}
		}

		System.out.println("最大值为：" + max);
		System.out.println("下标为：" + m);
	}
}