package collections.treemap;

import java.util.TreeMap;

public class MyBasicOperations {
	public static void main(String a[]){
		
        TreeMap<String, String> hm = new TreeMap<String, String>();
        
        //add key-value pair to TreeMap
        hm.put("airst", "1234");
        hm.put("aecond", "7894");
        hm.put("ahird","2654");
        
        System.out.println(hm);
        
        //getting value for the given key from TreeMap
        System.out.println("Value of second: "+hm.get("second"));
        
        System.out.println("Is TreeMap empty? "+hm.isEmpty());
        
        hm.remove("third");
        
        System.out.println(hm);
        
        System.out.println("Size of the TreeMap: "+hm.size());
    }

}
