package time_complexity;

public class ArrayEquilibriumIndex {
    
    public static int arrayEquilibriumIndex(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int left=0;
        for(int i=0;i<arr.length;i++){
            left+=arr[i];
            int g=sum-left+arr[i];
            if(left==g){
                return i;
            }
        }
        return -1;
        
        
    }
    public static void main(String[] args){
        int[] arr={1,4,9,3,2};
        int output= arrayEquilibriumIndex(arr);
        System.out.print(output);

    }
    
}
