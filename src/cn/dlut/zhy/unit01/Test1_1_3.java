package cn.dlut.zhy.unit01;

import edu.princeton.cs.introcs.StdIn;

public class Test1_1_3 {
    public static void main(String[] args) {
            int a=StdIn.readInt();
            int b=StdIn.readInt();
            int c=StdIn.readInt();
            if(a==b&&a==c)
                System.out.println("equal");
            else
                System.out.println("not equal");
    }
}
