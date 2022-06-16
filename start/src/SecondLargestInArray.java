public class SecondLargestInArray {
    public static int secondLargestInArray(int arr[]){
        int largest=Integer.MIN_VALUE;
        int sLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }

        }
        return sLargest;
    }
    public static void main(String[] args){
        int[] arr={6,6};
        System.out.print(secondLargestInArray(arr));
    }
    
}
