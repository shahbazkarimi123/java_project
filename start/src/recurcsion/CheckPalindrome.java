package recurcsion;

public class CheckPalindrome {
    public static boolean checkPalindrome(String palindrom, int si,int ei) {

        if(si>=ei){
            return true;
        }
        if(palindrom.charAt(si)==palindrom.charAt(ei)){
            boolean output=checkPalindrome(palindrom,si+1,ei-1);
            return output;
        }else{
            return false;
        }
    
    }



    public static void main(String[] args){
        String palindrome="racecar";
        boolean checked=checkPalindrome(palindrome,0,palindrome.length()-1);
        System.out.print(checked);
    }
}
