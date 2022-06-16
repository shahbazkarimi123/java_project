package sorting_algorithm;

public class Main {
    public static void main(String[] args){
        int[] a={10,5,9,0,1,2,3,8};
        BubleSort buble=new BubleSort();
        buble.bubleSort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        

        
    }
    
}
