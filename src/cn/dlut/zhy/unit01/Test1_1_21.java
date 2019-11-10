package cn.dlut.zhy.unit01;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Test1_1_21 {
    public static void main(String[] args) {
        System.out.print("请输入想输入的数据个数：");
        int n=StdIn.readInt();
        String[] nameArray=new String[n];
        int[] intArray1=new int[n];
        int[] intArray2=new int[n];
        for(int i=0;i<n;i++){
            nameArray[i]=StdIn.readString();
            intArray1[i]=StdIn.readInt();
            intArray2[i]=StdIn.readInt();
        }

        for(int i=0;i<n;i++){
            StdOut.printf("%4s\t%4d\t%4d\t%6.3f\n",nameArray[i],intArray1[i],intArray2[i],(float)intArray1[i]/intArray2[i]);
        }

    }
}
