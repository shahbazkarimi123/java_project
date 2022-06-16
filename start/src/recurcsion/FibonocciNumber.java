package recurcsion;

public class FibonocciNumber {
    public static int fibonocciNumber(int num){
        if(num<=1){
            return num;
        }
        
        int fibonocciNumber1=fibonocciNumber(num-1);
        int fibonocciNumber2=fibonocciNumber(num-2);
        
        int output=fibonocciNumber1+fibonocciNumber2;
        
        return output;
    }
    public static void main(String[] args){
        int value=fibonocciNumber(8);
        System.out.print(value);
    }

   
    
}
