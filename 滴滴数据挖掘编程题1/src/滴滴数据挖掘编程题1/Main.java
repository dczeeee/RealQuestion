package �ε������ھ�����1;

import java.util.Scanner;

/*
 * [�����] Ѱ�ҳ���
ʱ�����ƣ�1��

�ռ����ƣ�65536K

��ֻ��������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ����������7�� 
ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������

��������:
����N

�������:
��N������

��������1:
6

�������1:
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
