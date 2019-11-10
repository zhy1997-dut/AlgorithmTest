package cn.dlut.zhy.unit01;

public class Test1_1_20 {
    public static double ln(int N){
        if(N>1)
            return Math.log(N)+ln(N-1);
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(ln(10));
    }
}
