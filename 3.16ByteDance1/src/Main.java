import java.util.Scanner;
/*
 * ��Ŀ������
 * ���㣬С����1024Ԫ��������NԪ���ϰ���Ǯֻ��64Ԫ��16Ԫ��4Ԫ��1Ԫ����ֵ��Ҫ���������������
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(change(N));
	}
	
	private static int change(int N) {
		N = 1024 - N;
		int c64 = 0;
		int c16 = 0;
		int c4 = 0;
		int c1 = 0;
		while(N!=0) {
			if(N >= 64) {
				c64 = N/64;
				N -= c64*64;
			}
			else if(N >= 16) {
				c16 = N/16;
				N -= c16*16;
			}
			else if(N >= 4) {
				c4 = N/4;
				N -= c4*4;
			}
			else {
				c1 = N/1;
				N -= c1*1;
			}
		}
		return c64+c16+c4+c1;
	}
}
