package DAY2;

public class pattern10 {

    public static void Butterfly(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int a=1;a<=2*(row-i);a++){
                System.out.print(" ");
            }
            for(int b=1;b<=i;b++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i=row;1<=i;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int a=1;a<=2*(row-i);a++){
                System.out.print(" ");
            }
            for(int b=1;b<=i;b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row=4;
        Butterfly(row);   
    }
    
}
