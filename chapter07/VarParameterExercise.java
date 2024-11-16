/**
 * @author GuYuqi
 * 2024/7/6 14:00
 * 有三个方法，分别实现返回姓名和两门课成绩（总分），返回姓名和三门课成绩（总分），返回姓名和五门课成绩（总分）。封装成一个可变参数的方法
 */
public class VarParameterExercise {

	//编写一个 main 方法
	public static void main(String[] args) {
		HspMethod myHspMethod = new HspMethod();
		System.out.println(myHspMethod.showScore("Jack", 100, 90));
		System.out.println(myHspMethod.showScore("Jack", 100, 10, 20));
		System.out.println(myHspMethod.showScore("Jack", 100, 100, 100, 100, 100));
	}
}

class HspMethod {
	public String showScore(String name, double... scores) {
		double totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return name + " - " + totalScore;
	}
}