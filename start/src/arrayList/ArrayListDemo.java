package arrayList;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>() ;
        list.add( "Ant" );
        list.add( "Bat" );
        list.add( "Car" );
        list.add( "Door" );
        list.add( "Euro" );
        list.set( 2, "Bus" );
        System.out.print(list.get(2));
    }
    
}
