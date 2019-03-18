import java.util.Scanner;
/*
 * ��Ŀ������
 * �ض����ӣ����ӿ��Խضϣ������ܽ�ϣ���������������N��ʾ���Ӹ�����M��ʾ��Ҫ�ȳ��ļ��Σ�Ȼ������ÿ�����ӵĳ��ȣ������ض���
 * ����
 * 3 4
 * 3 5 4
 * �����
 * 2.50
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0;i < N;++i) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxLen(M, arr));
	}
	
	private static double maxLen(int M,int[] arr) {
		double count = 0;
	    for(int i = 0; i < arr.length; ++i) {
	    	count += arr[i];
	    }
	    if(count < M)
	        return 0;
	    double low = 1;
	    double high = 1000000;
	    while (low<high) {
	    	double mid = (low+high+1)/2;
	        count = 0;
	        for(int i = 0; i < arr.length; ++i)
	        	count += arr[i]/mid;
	        if(count < M)
	        	high = mid - 1;
	        else
	            low = mid;
	    }
	    if(low-0.5<Math.floor(low))
	    	return Math.floor(low);
	    else
	    	return Math.floor(low)+0.5;
	}
}