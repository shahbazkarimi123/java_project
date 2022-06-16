public class RotateArray {
    public static int[] rotateArry(int arr[],int x){
        //something went wrong
        boolean check= false;
        int[] arr2=new int[arr.length];
        int j=0;
        int checkBeforeMatch=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                checkBeforeMatch++;
                check=true;
            }else if(check){
                arr2[j]=arr[i];
                j++;
            }else{
                checkBeforeMatch++;

            }
        }
        for(int i=0;i<checkBeforeMatch;i++){
            arr2[j]=arr[i];
            j++;
        }
        return arr2;
    }
    public static void main(String[] args){
        int[] arr={1,0,9,2,5,6,7};
        int[] a=rotateArry(arr,2);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
