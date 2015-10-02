package collections.treemap;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MyTreeLastElement {
	public static void main(String a[]){
        //By using salary comparator (int comparison)
        TreeMap<Employee,String> trmap = new TreeMap<Employee, String>(new MySalaryCompr1());
        trmap.put(new Employee("Ram",3000), "RAM");
        trmap.put(new Employee("John",6000), "JOHN");
        trmap.put(new Employee("Crish",2000), "CRISH");
        trmap.put(new Employee("Tom",2400), "TOM");
        Employee em = trmap.lastKey();
        System.out.println("Least salary emp: "+em);
        Entry<Employee,String> ent = trmap.lastEntry();
        System.out.println("Entry set values: ");
        System.out.println(ent.getKey()+" ==> "+ent.getValue());
    }
}
 
class MySalaryCompr1 implements Comparator<Employee>{
 
    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getSalary() < e2.getSalary()){
            return 1;
        } else {
            return -1;
        }
    }
}
 
class Employee{
     
    private String name;
    private int salary;
     
    public Employee(String n, int s){
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
