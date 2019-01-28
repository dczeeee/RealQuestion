package 字节跳动大数据编程题2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * 时间限制：3秒

空间限制：131072K

给定一个数组序列, 需要求选出一个区间, 使得该区间是所有区间中经过如下计算的值最大的一个：

区间中的最小数 * 区间所有数的和最后程序输出经过计算后的最大值即可，不需要输出具体的区间。
如给定序列  [6 2 1]则根据上述公式, 可得到所有可以选定各个区间的计算值:

 

[6] = 6 * 6 = 36;

[2] = 2 * 2 = 4;

[1] = 1 * 1 = 1;

[6,2] = 2 * 8 = 16;

[2,1] = 1 * 3 = 3;

[6, 2, 1] = 1 * 9 = 9;

 

从上述计算可见选定区间 [6] ，计算值为 36， 则程序输出为 36。

区间内的所有数字都在[0, 100]的范围内;


输入描述:
第一行输入数组序列长度n，第二行输入数组序列。
对于 50%的数据,  1 <= n <= 10000;
对于 100%的数据, 1 <= n <= 500000;

输出描述:
输出数组经过计算后的最大值。

输入例子1:
3
6 2 1

输出例子1:
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
