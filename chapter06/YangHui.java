
public class YangHui {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int[][] arr = new int[10][];	

		//开辟每个一维数组的空间
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
		}

		//赋值
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(j == 0 || j == arr[i].length - 1) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
			}
		}

		//输出
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}
}