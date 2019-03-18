import java.util.Scanner;
/*
 * 题目描述：
 * 字符串校验
 * 1）连续三个一样的字母AAA,删掉第一个A
 * 2）AABB型，删除第一个B
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] str = new String[N];
		for(int i = 0;i < N;++i) {
			str[i] = sc.next();
		}
		for(int i = 0;i < N;++i) {
			System.out.println(check(str[i]));
		}
	}

	private static String check(String str) {
		int i = 0;
		while(i < str.length()) {
			if(i<str.length()-2 && str.charAt(i) == str.charAt(i+1) && str.charAt(i+1) == str.charAt(i+2)) {
				str = str.substring(0, i)+str.substring(i+1,str.length());
				i = 0;
				continue;
			}
			if(i<str.length()-3 && str.charAt(i) == str.charAt(i+1) && str.charAt(i+1) != str.charAt(i+2) && str.charAt(i+2) == str.charAt(i+3)) {
				str = str.substring(0, i+2)+str.substring(i+3,str.length());
				i = 0;
				continue;
			}
			i++;
		}
		return str;
	}
}
