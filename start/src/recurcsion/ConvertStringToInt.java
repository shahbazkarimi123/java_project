package recurcsion;

public class ConvertStringToInt {
    public static int convertStringToInt(String input){
        if(input.length()==1){
           return input.charAt(0)-'0';
        }
        int value=input.charAt(0)-'0';
        double power=Math.pow(10,input.length()-1);
        int smallOutput=(value * (int)power)+convertStringToInt(input.substring(1));
        return smallOutput;
    }
    public static void main(String[] args){
        String a="00001231";
        int output=convertStringToInt(a);
       System.out.print(output);
    }
    
}
