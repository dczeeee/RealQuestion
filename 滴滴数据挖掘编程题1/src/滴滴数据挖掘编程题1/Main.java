package 滴滴数据挖掘编程题1;

import java.util.Scanner;

/*
 * [编程题] 寻找丑数
时间限制：1秒

空间限制：65536K

把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。 
习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。

输入描述:
整数N

输出描述:
第N个丑数

输入例子1:
6

输出例子1:
6
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int num;
		boolean flag;
		for(num = 1;count < n;++num) {
			flag = isUglyNumber(num);
			if(flag == true) {
				count++;
			}
		}
		System.out.println(num);
	}
	
	public static boolean isUglyNumber(int num) {
		while(num%2 == 0) {
			num /=2;
		}
		while(num%3 == 0) {
			num /=3;
		}
		while(num%5 == 0) {
			num /=5;
		}
		if(num == 1) {
			return true;
		}
		else {
			return false;
		}
	}
}
