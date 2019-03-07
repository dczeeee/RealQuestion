package ��������С��k����;
/*
 * ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4
 */
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {4,5,1,6,2,7,3,8};
		System.out.println(GetLeastNumbers_Solution(input, 4));
	}
	public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(input.length<=0||k<=0){
            return list;
        }
        if(input.length<k){
            return list;
        }
        
        quicksort(input, 0, input.length-1);
        
        for(int m=0;m<k;m++){
            list.add(input[m]);
        }
        return list;
    }

	public static void quicksort(int[] n,int left,int right) {
		int dp;
		if(left < right) {
			dp = partition(n, left, right);
			quicksort(n, left, dp-1);
			quicksort(n, dp+1, right);
		}
	}
	
	public static int partition(int[] n,int left,int right) {
		int pivot = n[left];
		while(left < right) {
			while(left<right && n[right]>=pivot)
				right--;
			if(left < right)
				n[left++] = n[right];
			while(left<right && n[left]<=pivot)
				left++;
			if(left < right)
				n[right--] = n[left];
		}
		n[left] = pivot;
		return left;
	}
}
