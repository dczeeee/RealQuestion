import java.util.Scanner;
/*
 * 题目描述：
 * 输入两个八进制数，相加后输出和认识八进制
 * 输入：
 * 15
 * 5
 * 输出：
 * 22
 */
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(add(a,b));
    }
    
    private static int add(int a,int b){
        int oa = eigth2ten(a);
        int ob = eigth2ten(b);
        int sum = oa+ob;
        int res = ten2eight(sum);
        return res;
    }
    
    private static int eigth2ten(int a) {
    	String A = String.valueOf(a);
        int lena = A.length();
        int oa = 0;
        for(int i = 0;i <= lena;++i) {
        	oa += (int) (a%10 * Math.pow(8, i));
        	a /= 10;
        }
        return oa;
    }
    
    private static int ten2eight(int a) {
    	StringBuffer sb = new StringBuffer();
    	while(a > 0) {
    		sb.append(a%8);
    		a /= 8;
    	}
    	sb = sb.reverse();
    	return Integer.valueOf(sb.toString());
    }
}