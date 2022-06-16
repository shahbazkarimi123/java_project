package time_complexity;

public class FindUnique {
    public static int findUnique(int[] arr){
        if(arr.length==1){
            return arr[0];
        }
        int[] x=new int[arr.length-1];
        int smallOutput=arr[0];
        for(int i=1;i<arr.length;i++){
            x[i-1]=arr[i];
        }
        int output=smallOutput^findUnique(x);
        return output;
    }

    public static int findUniqueOneRecu(int[] arr){
        int x=arr[0];

        for(int i=0;i<arr.length-1;i++){
            x=x^arr[i+1];
        }
        return x;

    }
    public static void main(String[] args){
        int[] arr={4,1,7,9,6,4,2,7,6,1,2};
        // int output=findUnique(arr);
        int output=findUniqueOneRecu(arr);
        System.out.print(output);
    }
}
