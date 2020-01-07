package org.app.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ConvertMapToAL {
public static void main(String[] args) {
	Map<String, String> m=new HashMap<String, String>();
	m.put("vaish", "wankhade");
	m.put("ashu", "My");
	m.put("shu", "gosavi");
	System.out.println("before"+m);
	Set<Entry<String, String>> set =m.entrySet();
	List<Entry<String, String>> list=new ArrayList<Map.Entry<String,String>>(set);
	System.out.println("ArrayList of Key-Values :"); 
    System.out.println("after"+list);
    for (Entry<String, String> entry : list) 
    { 
        System.out.println(entry.getKey()+" : "+entry.getValue()); 
    } 
	
}
}
