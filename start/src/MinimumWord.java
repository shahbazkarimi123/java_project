public class MinimumWord {
    public static String minLengthWord(String word){
        //int num=0;
        for(int i =0;i<word.length();i++){
            if(word.charAt(i)!=' '){
          //      num++;

            }else{
            //    num=0;
            }
        }
        return "";
        
        }
    
    public static void main(String [] args){
        String word="abc as dxa a bac d";
        String s=minLengthWord(word);
        System.out.print(s);
    }
}
