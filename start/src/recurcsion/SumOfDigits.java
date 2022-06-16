package recurcsion;

public class SumOfDigits {
    public static int sumOfDitgits(int input){
        if(input==0){
            return 0;
        }
        int value1=input/10;
        int value2=input%10;
        int smallOutput=value2+sumOfDitgits(value1);
        return smallOutput;

    }
    public static void main(String[] args){
        int a=12345;
        int output=sumOfDitgits(a);
        System.out.print(output);
        
    }
    
}
