package DAY3;

public class BinarySearch {


    public static int binary(int[] arr){
        int target=1;
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target<arr[mid]&&arr[start]<target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return 0;
    }
    
    public static void main(String[] args) {
         int[] arr={1,2,3,4,5};
        binary(arr);
        System.out.println(binary(arr));
    }
    
}
