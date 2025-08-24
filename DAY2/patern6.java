package DAY2;

public class patern6 {
    public static void HalfPyramid(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print("  ");
            }for(int z=1;z<=i;z++){
                    System.err.print("* ");
                }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row=4;
        HalfPyramid(row);
    }
}
