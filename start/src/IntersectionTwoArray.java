public class IntersectionTwoArray {

    public static void inttersaction(int[] arr1,int[] arr2){
        int len1=arr1.length;
        int len2=arr2.length;
        if(arr1.length>arr2.length){
            int[] temp=arr1;
            arr1=arr2;
            arr2=temp;
            len1=arr1.length;
            len2=arr2.length;
        }
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j]=Integer.MIN_VALUE;
                }
            }

        }

    }
    public static void main(String[] args){
        int[] arr1={2,6,8,5,4,3};
        int[] arr2={2,3,4,7};
        inttersaction(arr1,arr2);

    }
    
}
