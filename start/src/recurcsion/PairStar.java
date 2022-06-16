package recurcsion;

public class PairStar {
    public static String addStars(String s){
        if(s.length()==1){
            return s;
        }
        

        String smallOutput=addStars(s.substring(1));
        if(s.charAt(0)==smallOutput.charAt(0)){
            
            return s.charAt(0)+"*"+smallOutput;
        }else{
            return s.charAt(0)+smallOutput;
        }
    }
    public static void main(String[] args){
        String input="hello";
        String output=addStars(input);
        System.out.print(output);

    }
    
}
