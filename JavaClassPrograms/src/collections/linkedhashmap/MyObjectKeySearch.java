package collections.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Set;

public class MyObjectKeySearch {
	public static void main(String a[]){
        
        LinkedHashMap<PriceSearch, String> hm = new LinkedHashMap<PriceSearch, String>();
     
        hm.put(new PriceSearch("Banana", 20), "Banana");
        hm.put(new PriceSearch("Apple", 40), "Apple");
        hm.put(new PriceSearch("Orange", 30), "Orange");
        
        printMap(hm);
        
        PriceSearch key = new PriceSearch("Banana", 20);
        System.out.println("Does key available? "+hm.containsKey(key));
    }
     
    public static void printMap(LinkedHashMap<PriceSearch, String> map){
         
        Set<PriceSearch> keys = map.keySet();
        for(PriceSearch p:keys){
            System.out.println(p+"==>"+map.get(p));
        }
    }
}
 
class PriceSearch{
     
    private String item;
    private int price;
     
    public PriceSearch(String itm, int pr){
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
        if (obj instanceof PriceSearch) {
            PriceSearch pp = (PriceSearch) obj;
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
