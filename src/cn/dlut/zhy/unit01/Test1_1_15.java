package cn.dlut.zhy.unit01;

import java.util.Arrays;

public class Test1_1_15 {
    public static int[] histogram(int[] a,int M){
        int[] result=new int[M];
        for(int i=0;i<M;i++){
            int temp=0;
            for(int j=0;j<a.length;j++){
                if(a[j]==i){
                    temp++;
                }
            }
            result[i]=temp;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a={1,2,2,1,3,5,0,1,2,4,3,1};
        int M=6;
        System.out.println(Arrays.toString(histogram(a,M)));
    }
}
