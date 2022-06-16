package recurcsion;

public class StareCase {
    public static int stareCase(int val){
        if(val==0){
            return 1;
        }
        if(val<=0){
            return 0;
        }
        int smallOutput=stareCase(val-1)+stareCase(val-2)+stareCase(val-3);
        return smallOutput;

    }
    public static void main(String[] args){
        int val=4;
        int output=stareCase(val);
        System.out.println(output);
    }
    
}
