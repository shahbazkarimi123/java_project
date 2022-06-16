public class QuickSort {
    public static int partition(int input[],int startIndex,int endIndex){
        int pivotElement=input[startIndex];
        int smallerNumCount=0;
        for(int i=startIndex+1;i<=endIndex;i++){
            if(input[i]<pivotElement){
                smallerNumCount++;
            }
        }
        int temp = input[startIndex+smallerNumCount];
        input[startIndex+smallerNumCount]=pivotElement;
        input[startIndex]=temp;
        int i=startIndex;
        int j=endIndex;
        while(i<j){
            if(input[i]<pivotElement){
                i++;
            }else if(input[j]>pivotElement){
                j--;
            }else{
                temp=input[i];
                input[i]=input[j];
                input[j]=temp;
                i++;
                j--;
            }

        }


        return startIndex+smallerNumCount;
    }

    public static void quickSort(int[] input,int startIndex,int endIndex){
        if(startIndex>=endIndex){
            return;
        }
        int pivotIndex=partition(input,startIndex,endIndex);
        quickSort(input,startIndex,pivotIndex-1);
        quickSort(input,pivotIndex+1,endIndex);
    }

    public static void main(String[] args){
        int[] input={3,1,5,6,4,9,0,6,10,12,15,2};
        quickSort(input,0,input.length-1);
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]);
        }
    }
    
}
