public class ReplaceCharactor {

    public static String replaValue(String input,char c1,char c2){
        if(input.length()==0){
            return input;
        }
        String smallOutput = replaValue(input.substring(1), c1, c2);
        if(input.charAt(0)==c1){
            return c2+smallOutput;

        }else{
            return input.charAt(0)+smallOutput;
        }

    }
    public static void main(String[] args){
        String input = "abaabcxam";
        String s=replaValue(input,'a','o');
        System.out.print(s);
    }
}
