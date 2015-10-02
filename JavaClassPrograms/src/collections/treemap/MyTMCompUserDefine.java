package collections.treemap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class MyTMCompUserDefine {
    public static void main(String a[]){
        //By using name comparator (String comparison)
        TreeMap<Employeee,String> tm = new TreeMap<Employeee, String>(new MyNameComp());
        
        tm.put(new Employeee("Ram",3000), "RAM");
        tm.put(new Employeee("John",6000), "JOHN");
        tm.put(new Employeee("Crish",2000), "CRISH");
        tm.put(new Employeee("Tom",2400), "TOM");
        
        Set<Employeee> keys = tm.keySet();
        
        for(Employeee key:keys)
        {
            System.out.println(key+" ==> "+tm.get(key));
        }
        
        System.out.println("===================================");
        
        //By using salary comparator (int comparison)
        TreeMap<Employeee,String> trmap = new TreeMap<Employeee, String>(new MySalaryComp());
        
        trmap.put(new Employeee("Ram",3000), "RAM");
        trmap.put(new Employeee("John",6000), "JOHN");
        trmap.put(new Employeee("Crish",2000), "CRISH");
        trmap.put(new Employeee("Tom",2400), "TOM");
        
        Set<Employeee> ks = trmap.keySet();
        
        for(Employeee key:ks){
            System.out.println(key+" ==> "+trmap.get(key));
        }
       
    }
    
    
}
 
class MyNameComp implements Comparator<Employeee>{
 
    @Override
    public int compare(Employeee e1, Employeee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
 
class MySalaryComp implements Comparator<Employeee>{
 
    @Override
    public int compare(Employeee e1, Employeee e2) {
        if(e1.getSalary() > e2.getSalary()){
            return 1;
        } else {
            return -1;
        }
    }
}
 
class Employeee{
     
    private String name;
    private int salary;
     
    public Employeee(String n, int s){
        this.name = n;
        this.salary = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }

}
