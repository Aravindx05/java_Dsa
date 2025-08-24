package DAY2;

public class pattern11 {
    public static void parall(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=(row-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int row=5;
        parall(row);
    }
    
}
