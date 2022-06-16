public class IntersectionOfTwoArr {
    public static void intersection(int arr1[],int arr2[]){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr2[j]=Integer.MIN_VALUE;
                    System.out.print(arr1[i]+" ");
                    break;
                }

            }
        }
    }

    public static void main(String[] args){
        int[] a={3,2,5,1,0,6,2,3,6,1,0};
        int[] b={5,3,9,0,5,1,6,10,0,15};
        intersection(a,b);
    }
    
}
