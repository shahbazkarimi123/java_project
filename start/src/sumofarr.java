public class sumofarr {
    public static int sumFunction(int[] input){
        if(input.length==1){
            return input[0];
        }
        int ans=input[0];
        int[] anotherArr=new int[input.length-1];
        for(int i=1;i<input.length;i++){
            anotherArr[i-1]=input[i];
        }
        ans=ans+sumFunction(anotherArr);
        return ans;
    }

    public static void main(String[] args){
        int[] arr={4,3,5,8};
        int sum = sumFunction(arr);
        System.out.print(sum);
    }
    
}
