public class Homework08 {
	int count = 9;
	public void count1() {
		count = 10;
		System.out.println("count1 = " + count);
	}
	public void count2() {
		System.out.println("count1 = " + count++);
	}
	public static void main(String[] args) {
		new Homework08().count1();
		Homework08 t1 = new Homework08();
		t1.count2();
		t1.count2();
	}
}