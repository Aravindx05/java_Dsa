package DAY2;

public class pattern9 {

    public static void BinaryPattern(int row){
        int count=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if(count==1){
                System.out.print(count+" ");
                count--;
                }else{
                    System.out.print(count+" ");
                    count++;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row=5;
        BinaryPattern(row);
    }    
}
