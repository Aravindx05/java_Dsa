package DAY2;

public class pattern13 {
    public static void Diamond(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=(row-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i=row;1<=i;i--){
            for(int j=1;j<=(row-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int row=4;
        Diamond(row);
    }
    
}
