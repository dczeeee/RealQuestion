package ��ƻ��;

import java.util.Scanner;

/*
 * ƻ��ֻ��6��װ��8��װ����n��ƻ����Ҫ�����õĴ����٣����������Ҫ�Ĵ��������������-1
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
 * ���ˣ�����������main������д��return����������������������������������������
 */

