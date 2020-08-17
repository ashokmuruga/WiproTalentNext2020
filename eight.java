import java.util.*;

public class eight {
    public static void main(String args[]) {
      
        
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("JAVA");
 
        list.add("J2EE");
 
        list.add("JSP");
 
        list.add("SERVLETS");
 
        list.add("STRUTS");
 
        System.out.println(list);      //Output : [JAVA, J2EE, JSP, SERVLETS, STRUTS]
 
        //getting an array containing all elements of the list.
 
        Object[] array = list.toArray();
 
        //Printing the elements of the returned array.
 
        for (Object object : array)
        {
            System.out.println(object);
        }
 


    }
}
