package hashmap;

import java.util.HashMap;

public class Hashmap {
	public static void main(String[] args) {
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(1,"Divya");
	hm.put(2,"sri");
	hm.put(3,"Sandya");
	hm.put(4,"pooja");
	System.out.println("Size of hashmap = "+hm.size()); 
	if(hm.containsKey(3)) {
		String a = hm.get(3);
		System.out.println("value of key \"3\" is "+a);
	 }
	}
		
}
