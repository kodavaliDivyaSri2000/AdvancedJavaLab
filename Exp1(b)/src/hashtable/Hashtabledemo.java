package hashtable;
import java.util.Hashtable;
import java.util.Map;

public class Hashtabledemo {
	public static void main(String[] args) {
	Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
	ht.put(1,"Divya");
	ht.put(2,"Mowrya");
	ht.put(3,"Santhu");
	ht.put(4,"sruthi");
	System.out.println("Size of hash table = "+ht.size());
	for(Map.Entry m:ht.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	}
	
}
