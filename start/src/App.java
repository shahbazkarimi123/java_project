public class App {
    public static int findUnique(int[] input) {
          int n=input.length;
          if(n==1){
              return input[0];
          }
          
          int ans=0;
          for(int i=0;i<n;i++){
            boolean check = false;
              for(int j=0;j<n;j++){
                  if(i!=j){
                      if(input[i]==input[j]){
                          check=false;
                          break;
                      }else{
                          check=true;
                          ans=input[i];
                      }
                  }
              }
              if(check){
                  return ans;
              }
          }
          return n;
          
          
    }
    public static void main(String[] args){
        int arr[]={2,3,6,3,6,2};
        int a = findUnique(arr);
        System.out.print(a);
    }
}
