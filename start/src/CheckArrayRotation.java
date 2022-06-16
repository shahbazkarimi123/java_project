public class CheckArrayRotation {

    public static int checkArrayRotation(int arr[]){
        //not completed another time.
        if(arr.length<=1){
            return 0;
        }
        int index=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                index++;
            }else{
                return index;
            }
        }

        return index;
    }
    public static void main(String[] agrs){
        int[] arr={1,5,6,1,2,3,4};
        int index = checkArrayRotation(arr);
        System.out.println(index);
    }
    
}
