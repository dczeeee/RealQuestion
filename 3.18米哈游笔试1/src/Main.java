import java.util.Scanner;
/*
 * 题目描述：
 * 一个公告有一个开始时间，以及结束时间，输入n个公告以及时间，输出用户在一个时间内最多可以看到多少个公告
 * 输入：
 * 2
 * 2 10
 * 5 15
 * 输出：
 * 2
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		for(int i = 0;i < n;++i) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		System.out.println(getNum(arr));
	}
	
	private static int getNum(int[][] arr) {
		int count = 1;
		int minStart = arr[0][0];
		int minEnd = arr[0][1];
		for(int i = 0;i < arr.length;++i) {
			if(arr[i][0] < minEnd && arr[i][1] > minEnd) {
				count++;
				if(arr[i][0] > minStart)
					minStart = arr[i][0];
				if(arr[i][1] < minEnd)
					minEnd = arr[i][1];
			}
		}
		return count;
	}
}