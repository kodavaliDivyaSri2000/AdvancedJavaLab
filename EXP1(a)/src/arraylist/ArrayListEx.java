package arraylist;
import java.util.ArrayList;
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> ob = new ArrayList<String>();
		ob.add("Divya");
		ob.add("Mowrya");
		ob.add("Santhu");
		ob.add("Siri");
		System.out.println("Currently the arraylist has following elements:"+ob);
		ob.add(1,"pooja");
		ob.add(2,"sreya");
		ob.remove("Siri");
		System.out.println("Currently the arraylist has following elements:"+ob);
		
	}
}
