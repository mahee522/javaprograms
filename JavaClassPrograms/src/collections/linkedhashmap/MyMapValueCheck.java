package collections.linkedhashmap;

import java.util.LinkedHashMap;

public class MyMapValueCheck {
	
	    public static void main(String a[]){
	         
	        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
	        lhm.put("one", "This is first element");
	        lhm.put("two", "This is second element");
	        lhm.put("four", "Element inserted at 3rd position");
	        
	        System.out.println("Map contains value 'This is first element'? "
	                +lhm.containsValue("This is first element"));
	    }

}
