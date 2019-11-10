package cn.dlut.zhy.unit01;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

import java.util.Arrays;

public class Test1_1_22 {
    public static int rank(int key,int[] a){
        return rank(key,a,0,a.length-1,0);
    }
    public static int rank(int key,int[] a,int lo,int hi,int deep){
        for(int i=0;i<deep;i++)
            System.out.print("\t");
        System.out.println("当前为第"+deep+"次递归，参数lo为："+lo+"，参数hi为："+hi);
        if(lo>hi)
            return -1;
        int mid=lo+(hi-lo)/2;
        if(key<a[mid])
            return rank(key,a,lo,mid-1,deep+1);
        else if(key>a[mid])
            return rank(key,a,mid+1,hi,deep+1);
        else
            return mid;
    }

    public static void main(String[] args) {
        int[] whitelist= {1,2,3,5,7,8,9,10,12,18,20,25,96,41,201};
        Arrays.sort(whitelist);

            System.out.print("请输入您想查找的数字：");
            int key=StdIn.readInt();
            if(rank(key,whitelist)==-1)
                StdOut.println(key);
    }
}
