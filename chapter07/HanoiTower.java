public class HanoiTower {

	//编写一个 main 方法
	public static void main(String[] args) {
		Tower tower = new Tower();
		tower.move(26, 'A', 'B', 'C');
	}
}

class Tower {

	//num - 表示要移动的个数
	//a, b, c - 分别表示 A 塔，B 塔，C 塔
	public void move(int num, char a, char b, char c) {
		//如果只有一个盘，即 num = 1
		if(num == 1) {
			System.out.println(a + " -> " + c);
		} else {
			//如果有多个盘，可以看成两个，即最下面的和上面的所有
			//先移动上面所有的盘到 b，中间借助 c
			move(num - 1, a, c, b);
			//把最下面的盘移动到 c
			System.out.println(a + " -> " + c);
			//再把 b 塔的所有盘移动到 c，借助 a
			move(num - 1, b, a, c);
		}
	}
}