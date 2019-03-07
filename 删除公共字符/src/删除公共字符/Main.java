package 删除公共字符;

import java.util.Scanner;
/*
 * 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
 * 例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”

输入描述:
每个测试输入包含2个字符串

输出描述:
输出删除后的字符串

输入例子1:
They are students. aeiou

输出例子1:
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
