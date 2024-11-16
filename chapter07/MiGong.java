public class MiGong {

	//编写一个 main 方法
	public static void main(String[] args) {

		//创建地图
		int[][] map = new int[8][7];
		//将最上面一行和最下面一行都置1
		for (int i = 0; i < 7; i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//将最右边和最左边的列也置1
		for (int i = 0; i < 8; i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		//单独置1
		map[3][1] = 1;
		map[3][2] = 1;

		//使用findWay给老鼠找路
		T t1 = new T();
		t1.findWay(map, 1, 1);

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class T {
	//使用递归回溯的思想解决
	//findWay方法就是专门来找出迷宫的路径
	//如果找到，就返回True，否则返回False
	//map 就是二维数组，即表示迷宫
	//i,j就是老鼠的位置，初始化位置为（1,1）
	//因为是递归找路，所以先规定map数组的各个值的含义
	//0 可以走 1 障碍物 2 走过可以走 3 走过但走不通
	//递归退出条件：map[6][5] == 2
	//找路策略：下 -> 右 -> 上 -> 左
	public boolean findWay(int[][] map, int i, int j) {
		if(map[6][5] == 2) {	//已经找到
			return true;
		} else {
			if(map[i][j] == 0) {	//当前位置0，可以走
				//假定可以走通
				map[i][j] = 2;
				//使用找路策略确定该位置是否真的可以走通
				//下 -> 右 -> 上 -> 左
				if(findWay(map, i + 1, j)) {	//下
					return true;
				} else if(findWay(map, i, j + 1)){	//右
					return true;
				} else if(findWay(map, i - 1, j)){	//上
					return true;
				} else if(findWay(map, i, j - 1)){	//左
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
			} else {	//map[i][j] = 1, 2, 3
				return false;
			}
		}
	}
}