public class CheckUnique {
    public static int checkUnique(int[] arr){
        int n=arr.length;
        if(n==1){
            return arr[0];
        }
        int m=-1;
        for(int i=0;i<n;i++){
            boolean check=false;
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        check=false;
                        break;
                    }else{
                        check=true;
                        m=i;
                    }
                }

            }
            if(check){
                return m;
            }
        }
        return n;

    }

    public static void main(String[] agrs){
        int[] arr={3,2,5,1,0,6,2,3,6,1,0};
        int indexValue = checkUnique(arr);
        System.out.println(indexValue);
    }
    
}
