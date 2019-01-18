package 字节跳动大数据编程题1;

import java.util.Scanner;
/*
 * P为给定的二维平面整数点集。定义 P 中某点x，如果x满足 P 中任意点都不在 x 的右上方区域内（横纵坐标都大于x），则称其为“最大的”。求出所有“最大的”点的集合。（所有点的横坐标和纵坐标都不重复, 坐标轴范围在[0, 1e9) 内）

如下图：实心点为满足条件的点的集合。请实现代码找到集合 P 中的所有 ”最大“ 点的集合并输出。




输入描述:
第一行输入点集的个数 N， 接下来 N 行，每行两个数字代表点的 X 轴和 Y 轴。
对于 50%的数据,  1 <= N <= 10000;
对于 100%的数据, 1 <= N <= 500000;

输出描述:
输出“最大的” 点集合， 按照 X 轴从小到大的方式输出，每行两个数字分别代表点的 X 轴和 Y轴。

输入例子1:
5
1 2
5 3
4 6
7 5
9 0

输出例子1:
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
