package org.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		List<String> name=new ArrayList<String>();
		name.add("harini");
		name.add("Hamshini");
		name.add("achcham illai ");
		name.add("achcham illai ");
		name.add("achcham enbadhillayae");
		System.out.println(name);
		Iterator<String> itr=name.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
				
		for(String name1:name){
			System.out.println(name);
		}
		System.out.println("get:"+name.get(1));
		name.set(1, "Bharathiyar");
		System.out.println(name);
		System.out.println(name.remove(1));
		//System.out.println(name.remove(10));//index out of bounds exception
		System.out.println(name);
		name.add(1,"hamshini");
		System.out.println(name);
		System.out.println("First index"+name.indexOf("achcham illai "));
		System.out.println("Last index"+name.lastIndexOf("achcham illai "));
		/*Collection<String> author=new ArrayList<String>();
		author.addAll(name);
		//author.add("Kavi");
		System.out.println(author);
		System.out.println(name.contains(author));//flase
		System.out.println(author);
		System.out.println(name.retainAll(author));
		System.out.println(name);
		System.out.println(name.equals(author));*/
		
		
	}

}
