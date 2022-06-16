public class checkarrsameornot {
    public static boolean checkNumber(int input[], int x) {
		int n=input.length;
        if(n==1 && input[0]!=x){
            return false;

        }
            
        
        if(input[0]==x){
            return true;
        }
        int anotherArr[]=new int[n-1];
        boolean check=true;
        for(int i=1;i<n;i++){
            anotherArr[i-1]=input[i];
        }
        check= check==checkNumber(anotherArr,x);
        return check;
        
		
	}
    public static void main(String [] args){
        int[] arr={9,5,10};
        boolean ans = checkNumber(arr,8);
        System.out.print(ans);
    }
}
