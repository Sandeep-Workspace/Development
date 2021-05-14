import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> phonebook = new HashMap<String,String>();
		phonebook.put("Sandeep","9993618648");
		phonebook.put("Mayank","9039579208");
		phonebook.put("Nitu","7000569768");
		phonebook.put("Papa","9827515679");
		
		Set<String> keys = phonebook.keySet();
		for(String s :keys) {
		System.out.println("Key:"+ s +": "+phonebook.get(s));
		}
		System.out.println("=====================================================================");
		Set<Map.Entry<String, String>> values = phonebook.entrySet();
		
		for(Map.Entry<String, String> m:values) {
			System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());
		}
	}

}
