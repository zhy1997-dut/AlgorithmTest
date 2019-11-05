package cn.dlut.zhy.unit01;

public class Test1_1_13 {
    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int M=array.length;
        int N=array[0].length;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(array[j][i]+"\t");
            }
            System.out.println("");
        }
    }
}
