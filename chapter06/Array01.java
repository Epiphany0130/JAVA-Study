
public class Array01 {	//Array - 数组
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//定义一个数组
		double[] hens = {3, 5, 1, 3.4, 2, 50};	//double 类型的数组，数组名 hens

		double totalWeight = 0;
		//遍历数组求和
		for(int i = 0; i < 6; i++){
			totalWeight += hens[i];
		}

		System.out.println("总体重:  " + totalWeight + "\n" + "平均体重： " + (totalWeight / 6));

	}
}