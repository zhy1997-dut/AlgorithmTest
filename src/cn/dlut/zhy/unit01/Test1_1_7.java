package cn.dlut.zhy.unit01;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Test1_1_7 {
    public static void main(String[] args) {
        double t=9.0;
        while(Math.abs(t-9.0/t)>.001)
            t=(9.0/t+t)/2.0;
        StdOut.printf("%.5f\n",t);
    }
}
