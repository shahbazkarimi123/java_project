public class RemoveConcicuativeDuplicate {
    public static String removeSameWord(String s){
        if(s.length()<=1){
            return s;
        }
        String smallOutput="";
        if(s.charAt(0)==s.charAt(1)){
            smallOutput = removeSameWord(s.substring(1));
        }else{
            smallOutput=s.charAt(0)+removeSameWord(s.substring(1));            
        }
        return smallOutput;
    }

    public static void main(String[] args){
        String word="xxxaaxxbbbxczzz";
        String removedWord = removeSameWord(word);
        System.out.print(removedWord);
    }
    
}
