package collections.treeset;

import java.util.TreeSet;

public class MyDuplicateEntry {
	public static void main(String a[]){
        String[] strArr = {"one","two","three","four","four","five","one","two"};
        
        TreeSet<String> unique = new TreeSet<String>();
        
        
        
        for(String str:strArr)
        {
            if(!unique.add(str))
            {
                System.out.println("Duplicate Entry is: "+str);
            }
        }
    }

}
