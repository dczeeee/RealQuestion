package �����ַ���;

import java.util.Scanner;
/*
 * ��һ�仰�ĵ��ʽ��е��ã���㲻���á����� I like beijing. �����������Ϊ��beijing. like I

��������:
ÿ�������������1������������ I like beijing. �����������Ȳ�����100

�������:
�����������֮����ַ���,�Կո�ָ�

��������1:
I like beijing.

�������1:
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