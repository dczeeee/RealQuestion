package �ֽ����������ݱ����2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * ʱ�����ƣ�3��

�ռ����ƣ�131072K

����һ����������, ��Ҫ��ѡ��һ������, ʹ�ø����������������о������¼����ֵ����һ����

�����е���С�� * �����������ĺ�����������������������ֵ���ɣ�����Ҫ�����������䡣
���������  [6 2 1]�����������ʽ, �ɵõ����п���ѡ����������ļ���ֵ:

 

[6] = 6 * 6 = 36;

[2] = 2 * 2 = 4;

[1] = 1 * 1 = 1;

[6,2] = 2 * 8 = 16;

[2,1] = 1 * 3 = 3;

[6, 2, 1] = 1 * 9 = 9;

 

����������ɼ�ѡ������ [6] ������ֵΪ 36�� ��������Ϊ 36��

�����ڵ��������ֶ���[0, 100]�ķ�Χ��;


��������:
��һ�������������г���n���ڶ��������������С�
���� 50%������,  1 <= n <= 10000;
���� 100%������, 1 <= n <= 500000;

�������:
������龭�����������ֵ��

��������1:
3
6 2 1

�������1:
36
 */
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] nums = new int[len];
		for(int i = 0;i < len;++i) {
			nums[i] = sc.nextInt();
		}
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1;i < Math.pow(2, len);++i) {
			List<Integer> cur = new ArrayList<Integer>();
			int temp = i;
			int index = 0;
			while(temp != 0) {
				if((temp&1) == 1) {
					cur.add(nums[index]);
				}
				index++;
				temp = temp>>1;
			}
//			System.out.println(cur);
			int res = 0;
			if(cur.size()==1) {
				res = cur.get(0) * cur.get(0);
				list.add(res);
			}
			else {
				int min = cur.get(0);
				for(int j = 0;j < cur.size();++j) {
					res += cur.get(j);
					if(min > cur.get(j)) {
						min = cur.get(j);
					}
				}
				res *= min;
				list.add(res);
			}
		}
//		System.out.println(list);
		int max = list.get(0);
		for(int i = 0;i < list.size();++i) {
			if(max < list.get(i)) {
				max = list.get(i);
			}
		}
		System.out.println(max);
	}

}
