package sorting_algorithm;

public class MergeSortAgain {
    public static void merge(int s1[],int s2[],int d[]){
        int i=0;
        int j=0;
        int k=0;
        while(i<s1.length && j<s2.length){
            if(s1[i]<s2[j]){
                d[k]=s1[i];
                i++;
                k++;
            }else{
                d[k]=s2[j];
                j++;
                k++;
            }
        }
        if(i<s1.length){
            while(i<s1.length){
                d[k]=s1[i];
                k++;
                i++;
            }
        }
        if(j<s2.length){
            while(j<s2.length){
                d[k]=s2[j];
                j++;
                k++;
            }
        }
    }
    public static void mergeSort(int arr[]){
        if(arr.length<=1){
            return;
        }
        int[] b=new int[arr.length/2];
        int[] c=new int[arr.length-b.length];
        for(int i=0;i<arr.length/2;i++){
            b[i]=arr[i];
        }
        for(int i=arr.length/2;i<arr.length;i++){
            c[i-arr.length/2]=arr[i];
        }
        mergeSort(b);
        mergeSort(c);
        merge(b,c,arr);
    }
    public static void main(String[] args){
        int[] arr={10,6,3,2,0,4,1,5,100,-2,-9,10,6,3,2,0,4,1,5};
        mergeSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
