
//break的使用
public class Break {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int total = 0;
		for (int i = 1; ; i++) {
			if(((int)(Math.random() * 100) + 1) == 97){
				break;
			}
			total++;
		}
		System.out.println(total);
	}
}