package collections.hashmap;

import java.util.HashMap;
import java.util.Set;

public class MyDeleteKeyObject {
	 public static void main(String a[]){
         
	        HashMap<Price1, String> hm = new HashMap<Price1, String>();
	        hm.put(new Price1("Banana", 20), "Banana");
	        hm.put(new Price1("Apple", 40), "Apple");
	        hm.put(new Price1("Orange", 30), "Orange");
	        printMap(hm);
	        Price1 key = new Price1("Banana", 20);
	        System.out.println("Deleting key...");
	        hm.remove(key);
	        System.out.println("After deleting key:");
	        printMap(hm);
	    }
	     
	    public static void printMap(HashMap<Price1, String> map){
	         
	        Set<Price1> keys = map.keySet();
	        for(Price1 p:keys){
	            System.out.println(p+"==>"+map.get(p));
	        }
	    }
	}
	 
	class Price1{
	     
	    private String item;
	    private int price;
	     
	    public Price1(String itm, int pr){
	        this.item = itm;
	        this.price = pr;
	    }
	     
	    public int hashCode(){
	        System.out.println("In hashcode");
	        int hashcode = 0;
	        hashcode = price*20;
	        hashcode += item.hashCode();
	        return hashcode;
	    }
	     
	    public boolean equals(Object obj){
	        System.out.println("In equals");
	        if (obj instanceof Price1) {
	            Price1 pp = (Price1) obj;
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
	

