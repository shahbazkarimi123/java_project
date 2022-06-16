package recurcsion;

public class CheckAB {
    public static boolean checkAB(String input){
        if(input.length()==0){
            return true;
        }
        boolean smallOutput=checkAB(input.substring(1));
        return true;
    }
    public static void main(String[] args){
        String input="abb";
        System.out.print(checkAB(input));
    }
    
}
