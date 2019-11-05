package cn.dlut.zhy.unit01;

import edu.princeton.cs.introcs.StdIn;

public class Test1_1_5 {
    public static void main(String[] args) {
        double x= StdIn.readDouble();
        double y=StdIn.readDouble();
        if(x>0&&x<1&&y>0&&y<1)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
