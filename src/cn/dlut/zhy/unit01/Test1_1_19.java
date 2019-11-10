package cn.dlut.zhy.unit01;

import edu.princeton.cs.introcs.StdOut;

public class Test1_1_19 {
    public static long F_old(int N){
        if(N==0)    return 0;
        if(N==1)    return 1;
        return F_old(N-1)+F_old(N-2);
    }

    public static long[] F(int N){
        long[] f=new long[N+1];
        f[0]=0;
        if(N>=1)
            f[1]=1;
        if(N>1){
            for(int i=2;i<N+1;i++)
                f[i]=f[i-1]+f[i-2];
        }
        return f;
    }

    public static void main(String[] args) {
        long[] fibonacci=F(99);
        for(int N=0;N<100;N++){
            StdOut.println(N+" "+fibonacci[N]);
        }
    }
}
