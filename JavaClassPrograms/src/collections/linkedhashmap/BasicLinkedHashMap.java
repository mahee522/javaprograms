package collections.linkedhashmap;

import java.util.LinkedHashMap;

public class BasicLinkedHashMap {
	 public static void main(String a[]){
         
	        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
	        
	        lhm.put("one", "1234");
	        lhm.put("two", "4567");
	        lhm.put("four", "7894");
	        
	        System.out.println(lhm);
	        
	        System.out.println("Getting value for key 'one': "+lhm.get("one"));
	        
	        System.out.println("Size of the map: "+lhm.size());
	        
	        System.out.println("Is map empty? "+lhm.isEmpty());
	        
	        System.out.println("Contains key 'two'? "+lhm.containsKey("three"));
	        
	        System.out.println("Contains value 'This is first element'? "
	                            +lhm.containsValue("4567"));
	        
	        System.out.println("delete element 'one': "+lhm.remove("one"));
	        
	        System.out.println(lhm);
	        lhm.clear();
	        System.out.println(lhm);
	    }

}
