package cn.dlut.zhy.unit01;

public class Test1_1_11 {
    public static void main(String[] args) {
        boolean[][] array={{true,true,false},{false,true,false},{true,false,true}};
        System.out.print("\t");
        for(int i=0;i<array[0].length;i++)
            System.out.print((i+1)+"\t");
        System.out.println("");
        for(int i=0;i<array.length;i++){
            System.out.print((i+1)+"\t");
            for(int j=0;j<array[i].length;j++){
                if(array[i][j])
                    System.out.print("*\t");
                else
                    System.out.print(" \t");
            }
            System.out.println("");
        }
    }
}
