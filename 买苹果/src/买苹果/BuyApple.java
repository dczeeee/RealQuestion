package 买苹果;

import java.util.Scanner;

/*
 * 苹果只有6个装和8个装，买n个苹果，要求尽量拿的袋子少，输出最少需要的袋数，不满足输出-1
 */
public class BuyApple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(apple());
	}
	
	public static int apple() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 6 || n%2 != 0 || n == 10) {
			return -1;
		}
		if(n%8 == 0) {
			return n/8;
		}
		return 1+n/8;
	}

}

/*
 * 醉了，笔试题里在main函数里写的return，啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊
 */

