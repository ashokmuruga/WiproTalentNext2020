import java.util.*;

public class seven {
    public static void main(String args[]) {
      
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("JAVA");
 
        list.add("J2EE");
 
        list.add("JSP");
 
        list.add("JAVA");
 
        list.add("SERVLETS");
 
        list.add("JAVA");
 
        list.add("STRUTS");
 
        System.out.println(list);     //Output : [JAVA, J2EE, JSP, JAVA, SERVLETS, JAVA, STRUTS]
 
        //Getting the index of first occurrence of "JAVA"
 
        System.out.println(list.indexOf("JAVA"));     //Output : 0
 
        //Getting the index of last occurrence of "JAVA"
 
        System.out.println(list.lastIndexOf("JAVA"));    //Output : 5
        
         System.out.println(list.indexOf("PYTHON")); //-1

    }
}
