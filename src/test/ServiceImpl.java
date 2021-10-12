package test;

import java.util.HashMap;
import java.util.Map;

public class ServiceImpl {
	private final static String NO_KEY_VALUYE = "No Registered Value";
	private final Map<String, String> dictionary;
	
	public ServiceImpl() {
		dictionary = new HashMap<String, String>();
		dictionary.put("Bob Dylan", "Blowin' in the wind");
		dictionary.put("Pete Seeger", "We shall Overcome");
		dictionary.put("Woody Guthrie", "This Land is Your Land");
		dictionary.put("Kingstone Trio", "Where Have All the Flowres Gong?");
	}
	
	public String get(String key) {
		return dictionary.getOrDefault(key, NO_KEY_VALUYE);
	}
}
