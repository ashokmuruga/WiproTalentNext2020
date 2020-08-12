import java.util.*;

public class three {
    public static void main(String args[]) {
      
        ArrayList<String> list = new ArrayList<String>();
 
        //Now 'list' can hold 10 elements (Default Initial Capacity)
 
        list.ensureCapacity(20);
 
        //Now 'list' can hold 20 elements.
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
 
        list.add("FOUR");
 
        //reducing the current capacity to current size of an ArrayList.
 
        list.trimToSize();

        
        
    }
}
