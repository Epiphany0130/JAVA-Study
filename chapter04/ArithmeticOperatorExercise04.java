/**
 * @author GuYuqi
 * 2024/5/24 17:12
 * 假如还有59天放假，问：合XX个星期零XX天？[ArithmeticOperatorExercise04.java]
 */ 

public class ArithmeticOperatorExercise04 {

	//编写一个main方法
	public static void main(String[] args) {
		
		int day = 59;
		int n1 = day / 7;
		int n2 = day % 7;
		System.out.println(n1 + "个星期零" + n2 + "天");
	}
}