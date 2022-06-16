package recurcsion;

public class GeometricSum {
    public static double geometricSum(int k){
         if(k<0){
            return 0;
        }
        double smallValue=(1/(double)Math.pow(2,k))+geometricSum(k-1);
        return smallValue;
        
    
        
    }
    public static void main(String[] args){
        int n=3;
        double output=geometricSum(n);
        
          System.out.print(output);
    }
    
}
