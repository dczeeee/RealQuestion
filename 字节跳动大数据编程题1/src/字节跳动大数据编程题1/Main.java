package �ֽ����������ݱ����1;

import java.util.Scanner;
/*
 * PΪ�����Ķ�άƽ�������㼯������ P ��ĳ��x�����x���� P ������㶼���� x �����Ϸ������ڣ��������궼����x���������Ϊ�����ġ���������С����ġ���ļ��ϡ������е�ĺ�����������궼���ظ�, �����᷶Χ��[0, 1e9) �ڣ�

����ͼ��ʵ�ĵ�Ϊ���������ĵ�ļ��ϡ���ʵ�ִ����ҵ����� P �е����� ����� ��ļ��ϲ������




��������:
��һ������㼯�ĸ��� N�� ������ N �У�ÿ���������ִ����� X ��� Y �ᡣ
���� 50%������,  1 <= N <= 10000;
���� 100%������, 1 <= N <= 500000;

�������:
��������ġ� �㼯�ϣ� ���� X ���С����ķ�ʽ�����ÿ���������ֱַ������ X ��� Y�ᡣ

��������1:
5
1 2
5 3
4 6
7 5
9 0

�������1:
4 6
7 5
9 0
 */

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] point = new int[n][2];
        for(int i = 0;i < n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            point[i][0] = x;
            point[i][1] = y;
        }
        for(int i = 0;i < point.length;i++){
        	int flag = 0;
            for(int j = 0;j < point.length;j++){
            	if(point[i][0] > point[j][0] && point[i][1] > point[j][1]){
                    flag ++;
                }
            	else if(point[i][0] < point[j][0] && point[i][1] > point[j][1]){
                    flag ++;
                }
            	else if(point[i][1] < point[j][1] && point[i][0] > point[j][0]){
                    flag ++;
                }
            }
            if(flag == point.length-1) {
            	System.out.println(point[i][0]+" "+point[i][1]);
            }
        }
    }
}
