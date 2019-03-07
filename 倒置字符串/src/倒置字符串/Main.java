package 倒置字符串;

import java.util.Scanner;
/*
 * 将一句话的单词进行倒置，标点不倒置。比如 I like beijing. 经过函数后变为：beijing. like I

输入描述:
每个测试输入包含1个测试用例： I like beijing. 输入用例长度不超过100

输出描述:
依次输出倒置之后的字符串,以空格分割

输入例子1:
I like beijing.

输出例子1:
beijing. like I
 */

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        String res = "";
        for(int i=0;i<strs.length;++i){
            res = strs[i] + res;
            if(i!=strs.length-1)
                res = " "+res;
        }
        System.out.println(res);
    }
}