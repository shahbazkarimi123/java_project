public class SumOfTwoArray {
    public static void sumOfTwoArray(int arr1[],int arr2[],int output[]){
        int len1=arr1.length;
        int len2=arr2.length;
        int outLen=output.length;
        int i=0,j=0,carry=0,k=0,sum=0;;
        while(i<len1 && j<len2){
            
            sum=arr1[len1-1-i]+arr2[len2-1-i]+carry;
            carry=sum/10;
            output[outLen-1-k]=sum%10;
            
            i++;
            j++;
            k++;
            
        }
        
            while(i<len1){
                sum=arr1[i]+carry;
                carry=sum/10;
                output[outLen-1-k]=sum%10;


                i++;
                k++;

            }
            
      
            while(j<len2){
                sum=arr2[j]+carry;
                carry=sum/10;   
                output[outLen-1-k]=sum%10;
                j++;
                k++;
            }
        
    }
    public static void main(String[] args){
        int[] arr1={5,2,4,5};
        int[] arr2={4,9,9,5};
        int[] output = new int[arr2.length+1];
        sumOfTwoArray(arr1,arr2,output);
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]);
        }
    }
    
}
