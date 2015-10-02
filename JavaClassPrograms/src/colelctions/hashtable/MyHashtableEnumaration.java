package colelctions.hashtable;
import java.util.Enumeration;
import java.util.Hashtable;
 
public class MyHashtableEnumaration {
 
public static void main(String a[]){
         
        Hashtable<String, String> hm = new Hashtable<String, String>();
        //add key-value pair to Hashtable
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        Enumeration<String> keys = hm.keys();
        while(keys.hasMoreElements()){
            String key = keys.nextElement();
            System.out.println("Value of "+key+" is: "+hm.get(key));
        }
    }
}
