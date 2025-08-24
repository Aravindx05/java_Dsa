package DAY2;

public class pattern12 {
    public static void HollowR(int row,int col){
         for(int i=1;i<row;i++){
            for(int j=4;i<=j;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=col;j++){
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
        int col=4;
        HollowR(row,col);
    }    
}
