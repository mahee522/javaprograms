package collections.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Set;

public class MyDeleteKeyObject {
	public static void main(String a[]){
        
        LinkedHashMap<PriceKey, String> hm = new LinkedHashMap<PriceKey, String>();
       
        hm.put(new PriceKey("Banana", 20), "Banana");
        hm.put(new PriceKey("Apple", 40), "Apple");
        hm.put(new PriceKey("Orange", 30), "Orange");
        
        printMap(hm);
        
        PriceKey key = new PriceKey("Banana", 20);
        System.out.println("Deleting key...");
        
        hm.remove(key);
        
        System.out.println("After deleting key:");
        printMap(hm);
    }
     
    public static void printMap(LinkedHashMap<PriceKey, String> map){
         
        Set<PriceKey> keys = map.keySet();
        for(PriceKey p:keys){
            System.out.println(p+"==>"+map.get(p));
        }
    }
}
 
class PriceKey{
     
    private String item;
    private int price;
     
    public PriceKey(String itm, int pr){
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
        if (obj instanceof PriceKey) {
            PriceKey pp = (PriceKey) obj;
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
