package cn.dlut.zhy.unit01;

public class Test1_1_14 {
    public static int lg(int N){
        int result=0;
        while(N>1){
            N=N/2;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int N=128;
        System.out.println(lg(N));
    }
}
