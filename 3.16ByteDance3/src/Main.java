import java.util.*;
/*
 * 题目描述：
 * 几个人围一圈，每个人有一个分数，每个人至少得到一个奖品，如果一个人比左右的人分数都高，则得到的奖品也比左右人的多，求最少需要多少奖品
 * 输入：
 * 2
 * 1 2
 * 5
 * 2 4 1 3 5
 * 输出：
 * 3
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] n = new int[N];
		int[][] arr = new int[N][];
		for(int i = 0;i < N;++i) {
			n[i] = sc.nextInt();
			for(int j = 0;j < n[i];++j) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0;i < N;++i) {
			System.out.println(score(i, arr[i]));
		}
	}
	
	private static int score(int n,int[] arr) {
		int res = 0;
		int min = arr[0];
		int minIndex = 0;
		for(int i = 0;i < arr.length;++i) {
			if(min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}
		}
		int[] num = new int[arr.length];
		for(int i = 0;i < arr.length;++i) {
			if(arr[i] == min)
				num[i] = 1;
		}
		if(minIndex == 0) {
			for(int i = minIndex;i < arr.length;++i) {
				if(i < arr.length-1 && arr[i+1] > arr[i]) {
					num[i+1] = num[i]+1;
				}
				else if(i < arr.length-1 && arr[i+1]<arr[i]&&arr[i+1]<arr[i+2]) {
					num[i+1] = 1;
				}
			}
			for(int i = 0;i <arr.length;++i) {
				res += num[i];
			}
		}
		return res;
	}
}