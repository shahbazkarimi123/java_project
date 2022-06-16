public class IntersectionTwoArr {
    public static void merge(int[] x,int[] y,int[] input){
        int i=0;
        int j=0;
        int k=0;
        while(i<x.length && j<y.length){
            if(x[i]<y[j]){
                input[k]=x[i];
                i++;
                k++;
            }else{
                input[k]=y[j];
                j++;
                k++;
            }
        }
        if(i<x.length){
            input[k]=x[i];
            k++;
            i++;
        }
        if(j<y.length){
            input[k]=y[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] input){
        
        if(input.length<=1){
            return;
        }
        int[] x=new int[input.length/2];
        int[] y=new int[input.length-x.length];
        for(int i=0;i<input.length/2;i++){
            x[i]=input[i];
        }
        for(int j=input.length/2;j<input.length;j++){
            y[j-input.length/2]=input[j];
        }
        mergeSort(x);
        mergeSort(y);
        merge(x,y,input);
    }
    public static void intersectArray(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }

        }
        
    }
    public static void main(String [] args){
        int[] arr1={3,5,2,5,9,8,5,10};
        int[] arr2={4,2,6,3,1,9,0};
        mergeSort(arr1);
        mergeSort(arr2);
        intersectArray(arr1,arr2);
        
        
    }
    
}
