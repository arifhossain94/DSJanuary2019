package ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UseListHashMap {

	public static void main(String[] args) {
		List<String> cityOfUSA = new ArrayList<String>();
		cityOfUSA.add("NY");
		cityOfUSA.add("CA");
		cityOfUSA.add("FL");
		
		List<String> cityOfUK = new ArrayList<String>();
		cityOfUK.add("London");
		cityOfUK.add("Manchester");
		
		List<String> cityOfCanada = new ArrayList<String>();
		cityOfCanada.add("Montreal");
		cityOfCanada.add("Toronto");
		cityOfCanada.add("Vancouver");
		
		
		Map<String, List<String>> map = new LinkedHashMap<String,List<String>>();
		map.put("USA", cityOfUSA);
		map.put("UK", cityOfUK);
		map.put("Canada", cityOfCanada);
		
		for(Entry<String, List<String>> country:map.entrySet()) {
		       System.out.println(country.getKey()+ " "+ country.getValue());
		}
		
	}

}
