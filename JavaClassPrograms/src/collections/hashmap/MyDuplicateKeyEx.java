package collections.hashmap;

import java.util.HashMap;
import java.util.Set;

public class MyDuplicateKeyEx {
	 public static void main(String a[]){
         
	        HashMap<Price2, String> hm = new HashMap<Price2, String>();
	        hm.put(new Price2("Banana", 20), "Banana");
	        hm.put(new Price2("Apple", 40), "Apple");
	        hm.put(new Price2("Orange", 30), "Orange");
	        printMap(hm);
	        Price2 key = new Price2("Banana", 20);
	        System.out.println("Adding duplicate key...");
	        hm.put(key, "Grape");
	        System.out.println("After adding dulicate key:");
	        printMap(hm);
	    }
	     
	    public static void printMap(HashMap<Price2, String> map){
	         
	        Set<Price2> keys = map.keySet();
	        for(Price2 p:keys){
	            System.out.println(p+"==>"+map.get(p));
	        }
	    }
	}
	 
	class Price2{
	     
	    private String item;
	    private int price;
	     
	    public Price2(String itm, int pr){
	        this.item = itm;
	        this.price = pr;
	    }
	     
	    public int hashCode(){
	        int hashcode = 0;
	        hashcode = price*20;
	        hashcode += item.hashCode();
	        return hashcode;
	    }
	     
	    public boolean equals(Object obj){
	        if (obj instanceof Price2) {
	            Price2 pp = (Price2) obj;
	            return (pp.item.equals(this.item) && pp.price == this.price);
	        } else {
	            return false;
	        }
	    }
	     
	    public String getItem() {
	        return item;
	    }
	    public void setItem(String item) {
	        this.item = item;
	    }
	    public int getPrice() {
	        return price;
	    }
	    public void setPrice(int price) {
	        this.price = price;
	    }
	     
	    public String toString(){
	        return "item: "+item+"  price: "+price;
	    }
	}
	

