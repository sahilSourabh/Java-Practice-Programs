package javaPractice.BasicPrograms;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapElements {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map = new TreeMap<>();
		
		map.put(11, "Sourabh");
		map.put(31, "Monty");
		map.put(22, "Shobhit");
		map.put(44, "Vicky");
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String> e: map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		for(Integer key: map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}

	}

}
