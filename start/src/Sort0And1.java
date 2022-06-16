public class Sort0And1 {
    public static void sort0And1(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(arr[start]==0){
                start++;
            }else if(arr[end]==1){
                end--;
            }else{
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end]= temp;
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args){
        int[] a={0,1,0,0,0,1,1,1,0,1,0};
        sort0And1(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
