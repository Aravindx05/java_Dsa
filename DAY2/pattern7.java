package DAY2;

public class pattern7 {

    public static void NumberPyramid(int row,int col){
        for(int i=0;i<row;i++){
            for(int j=1;j<=col-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row=5;
        int col=5;
        NumberPyramid(row, col);
    }
    
}
