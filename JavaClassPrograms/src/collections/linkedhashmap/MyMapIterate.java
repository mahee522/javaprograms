package collections.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

import javax.net.ssl.SSLContext;

public class MyMapIterate {
	public static void main(String a[]){
        
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        
        lhm.put("one", "This is first element");
        lhm.put("two", "This is second element");
        lhm.put("four", "Element inserted at 3rd position");
        
        Set<Entry<String, String>> keys = lhm.entrySet();
        
        for(Entry<String, String> k:keys)
        {
            System.out.println(k);
        }
        System.out.println("------------------------------");
        
        //here we are storing keys
        Set<String> values=lhm.keySet();
        for(String v: values)
        {
        	System.out.println(lhm.get(v));
        }
        String s[]=new String[lhm.size()];
      
        values.toArray(s);
        
       for (String i:s) {
		System.out.println(i);
       }
        
    }

}
