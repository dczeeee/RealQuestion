package ɾ�������ַ�;

import java.util.Scanner;
/*
 * ���������ַ������ӵ�һ�ַ�����ɾ���ڶ����ַ��������е��ַ���
 * ���磬���롱They are students.���͡�aeiou������ɾ��֮��ĵ�һ���ַ�����ɡ�Thy r stdnts.��

��������:
ÿ�������������2���ַ���

�������:
���ɾ������ַ���

��������1:
They are students. aeiou

�������1:
Thy r stdnts.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		String res = "";
		for(int i=0;i<ch1.length;++i) {
			int flag = 0;
			for(int j=0;j<ch2.length;++j) {
				if(ch1[i]==ch2[j]) {
					flag++;
				}
			}
			if(flag == 0)
				res += ch1[i];
		}
		System.out.println(res);
	}
}
