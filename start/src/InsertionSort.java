public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int a=i;
            while(arr[a]>arr[a+1]){
                
                    int temp=arr[a];
                    arr[a]=arr[a+1];
                    arr[a+1]=temp;
                    if(a>0){
                        a--;

                    }
                    

            
                
            }
            
        }
    }
    public static void main(String[] args){
        int[] arr={9,0,2,1,8,6,5,4};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
