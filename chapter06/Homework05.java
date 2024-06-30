/**
 * @author GuYuqi
 * 2024/5/27 23:19
 * 随机生成10个整数（1-100的范围）保存到数组，并倒序打印以及求平均值、球最大值和最大值的下标、并查找里面是否有8[Homework05.java]
 */

 public class Homework05 {
 	
 	//编写一个main方法
 	public static void main(String[] args) {
 		
 		//生成随机数并存入数组
 		int[] arr = new int[10];
 		for (int i = 0; i < arr.length; i++) {
 			arr[i] = (int)(Math.random() * 100) + 1;
 		}

 		//倒叙打印
 		for (int i = arr.length - 1; i >= 0; i--) {
 			System.out.print(arr[i] + " ");
 		}

 		//计算平均值，找到最大值、最小值下标并找8
 		int avg = 0, max = arr[0], min = arr[0];
 		int m = 0, n = 0, f = 0;
 		for (int i = 0; i < arr.length; i++) {
 			avg += arr[i];
 			if(arr[i] > max) {
 				max = arr[i];
 				m = i;
 			} else if(arr[i] < min) {
 				min = arr[i];
 				n = i;
 			}

 			if(arr[i] == 8) {
 				f = 1;
 			}
 		}
 		
 		System.out.println("\n平均值：" + (double)(avg / 10) + "\n最大值下标：" + m + "\n最小值下标：" + n);
 		if(f == 1) {
 			System.out.println("有8");
 		} else {
 			System.out.println("没有8");
 		}
 	}
 } 