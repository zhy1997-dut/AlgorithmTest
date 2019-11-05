package cn.dlut.zhy.unit01;

public class Test1_1_9 {
    public static void main(String[] args) {
        String s="";
        int N=28;
        for(int n=N;n>0;n/=2)
            s=(n%2)+s;
        System.out.println(s);
    }
}
