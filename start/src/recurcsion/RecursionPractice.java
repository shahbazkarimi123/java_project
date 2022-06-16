package recurcsion;

public class RecursionPractice {
    public static int numberOfDigits(int num){
        if(num==0){
            return 0;
        }
        int smallOutput=num/10;
        int output=1+numberOfDigits(smallOutput);
        return output;
    }


    public static void main(String[] args){
        int value=numberOfDigits(1);
        System.out.print(value);
    }
    
}
