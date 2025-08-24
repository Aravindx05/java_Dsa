package DAY2;


public class pattern5 {

    public static void hallown(int row,int col){
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(i==1||i==4||j==1||j==4){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row=5;
        int col=6;
        hallown(row,col);
    }    
}
