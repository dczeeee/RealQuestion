package ���;

import java.util.Scanner;

/*
 * ������������ n �� m��������1��2��3.......n ������ȡ������,ʹ��͵��� m ,Ҫ���������еĿ�������г���

��������:
ÿ�������������2������,n��m

�������:
��ÿ����ϵ��ֵ����������,ÿ�����һ�����

��������1:
5 5

�������1:
1 4
2 3
5
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i=1;i<=m/2;++i) {
			for(int j=1;j<=n;++j) {
				if(i+j==m) {
					System.out.println(i+" "+j);
				}
			}
		}
		if(n>=m) {
			System.out.println(m);
		}
	}

}
