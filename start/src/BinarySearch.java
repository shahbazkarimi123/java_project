public class BinarySearch {
    public static void binarySearch(int arr[],int x){
        int start=0;
        int end = arr.length;
        int mid = end/2;
        while(start<=end){
            if(arr[mid]>x){
                end=mid;
                mid=(start+end)/2;
            }else if(arr[mid]<x){
                start=mid;
                mid=(start+end)/2;
                


            }else{
                System.out.print(mid);

                return;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,5,6,9,10,14,16,20,25};
        binarySearch(arr,7);
    }
    
}
