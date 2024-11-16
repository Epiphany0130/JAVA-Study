/**
 * @author GuYuqi
 * 2024/5/26 16:40
 * 输出1-100之间的不能被5整除的数，每5个一行[Homework05.java]
 */ 

public class Homework05 {
	
	//编写一个 main 方法
	public static void main(String[] args) {
		
		int count = 0;	//计数器
		for (int i = 1; i <= 100; i++) {
			if(i % 5 != 0){
				System.out.print(i + "\t");
				count++;
				if(count % 5 == 0){
					System.out.println(" ");
				}
			}
		}
	}
}