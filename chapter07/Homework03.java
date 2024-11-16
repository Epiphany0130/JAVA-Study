/**
 * @author GuYuqi
 * 2024/7/7 12:49
 * 编写类 Book，定义方法 updatePrice，实现更改某本书的价格，具体：如果价格>150，则更改为150，如果价格>100，更改为100，否则不变
 */
public class Homework03 {

	//编写一个 main 方法
	public static void main(String[] args) {
		double price = 80;

		//new 对象
		Book b = new Book();
		//更改价格
		price = b.updatePrice(price);
		//输出价格
		System.out.println(price);
	}
}

class Book {

	//定义方法
	public double updatePrice(double price) {
		return price > 150 ? 150 : price > 100 ? 100 : price;
	}
}