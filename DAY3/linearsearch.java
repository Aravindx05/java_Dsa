package DAY3;

public class linearsearch {


    public static void linear(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(3==arr[i]){
                System.out.println("found at index:"+i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        linear(arr);
    }   
}
