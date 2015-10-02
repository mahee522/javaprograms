package colelctions.hashtable;

import java.util.Hashtable;

public class MyHashtableClear {
 
    public static void main(String a[]){
        Hashtable<String, String> hm = new Hashtable<String, String>();
        
        
        
        //add key-value pair to Hashtable
        hm.put("first", "FIRST INSERTED");
        hm.put("first", "FIRST ");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        
        System.out.println("My Hashtable content:");
        System.out.println(hm);
        
        System.out.println("Clearing Hashtable:");
        hm.clear();
        
        System.out.println("Content After clear:");
        System.out.println(hm);
    }
}
