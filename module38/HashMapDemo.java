package exe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		//to insert key-value pair
		map.put("Kyaw Kyaw", "0923432435");
		map.put("Phyu Phyu", "0911111111111");
		map.put("Zaw Zaw", "092222222222");
		System.out.println(map);
		map.replace("Phyu Phyu","09444444444");
		System.out.println(map);
		map.remove("Zaw Zaw");
		System.out.println(map);
		map.put("Sai Sai", "0955555555");
		System.out.println(map);
		System.out.println(map.get("Sai Sai"));
		System.out.println("Retrieve Element using For each:");
				 for( String  key : map.keySet())
			 System.out.println("Key="+key +" :Value="+map.get(key));
		
				 System.out.println("Retrieve Element using Iterator:");
				Set entrySet=map.entrySet();
				Iterator it=entrySet.iterator();
				while(it.hasNext())
				{
					 Map.Entry kv=(Entry) it.next();
					 System.out.println("Key="+kv.getKey() +" :Value="+kv.getValue());
				}
	}

}
