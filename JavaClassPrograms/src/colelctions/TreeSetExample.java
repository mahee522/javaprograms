package colelctions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TreeSetExample {
public static void main(String[] args) {
	Set s=new HashSet();
	s.add("aaa");
	s.add("bbb");
	s.add("ccc");
	
	Iterator it=s.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
