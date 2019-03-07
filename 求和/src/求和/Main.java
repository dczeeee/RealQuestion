package 求和;

import java.util.Scanner;

/*
 * 输入两个整数 n 和 m，从数列1，2，3.......n 中随意取几个数,使其和等于 m ,要求将其中所有的可能组合列出来

输入描述:
每个测试输入包含2个整数,n和m

输出描述:
按每个组合的字典序排列输出,每行输出一种组合

输入例子1:
5 5

输出例子1:
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
