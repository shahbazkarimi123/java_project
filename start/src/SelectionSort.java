public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minValue=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minValue]>arr[j]){
                    minValue=j;
                    
                }
                
            }
            int temp=arr[minValue];
                arr[minValue]=arr[i];
                arr[i]=temp;

        }
    }
    public static void main(String[] args){
        int[] arr={9,2,1,8,6,5,0,4};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
