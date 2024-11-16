public class Method02 {

	//编写一个 main 方法
	public static void main(String[] args) {

		int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};

		//遍历 map 数组
		//传统方法：直接遍历
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		//使用方法完成输出
		System.out.println("=====");
		MyTools tool = new MyTools();
		tool.printArr(map);
	}
}

//把输出的功能，写到一个类的方法中，然后调用该方法
class MyTools {
	//方法，接受一个二维数组
	public void printArr(int[][] map) {
		//对传入的二维数组进行遍历输出
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}