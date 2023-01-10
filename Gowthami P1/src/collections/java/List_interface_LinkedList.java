package collections.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_interface_LinkedList 
{

	public static void main(String[] args)
	{
	
		/*
		 * List store group of object inorder. And allow
		 * duplicate values.
		 */
		
		

		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("two");
		list.add("four");
		list.add("five");
		list.add("six");
		
		
		//get single object from collection using index number
		String indexobj=list.get(2);
		System.out.println("2nd index object is--->"+indexobj);
		
		
		//remove object using name
		list.remove("four");
		
		
		//get size of collection
		int count=list.size();
		System.out.println("collection count is--->"+count);
		
		
		//verify requried object contains in collection
		Boolean flag=list.contains("five");
		System.out.println("object availablestatus is--->"+flag);
		
		
		//get first iterator value
		String firstobject=list.iterator().next();
		System.out.println("first iterator object is ----> "+firstobject);
		
		
		//clear all objects from collectin
		//list.clear();
		
		
		
		//verify collection empty status
		Boolean flag1=list.isEmpty();
		System.out.println("collection empty status---> "+flag1);
		
		
        //reading all collection object using for loop
		for (int i = 0; i < list.size(); i++) 
		{
			String runtimeobj=list.get(i);
			System.out.println(runtimeobj);
		}
		
		
		//read all object from collection using foreach loop
		for (String eachobj : list)
		{
			System.out.println(eachobj);
		}
			
		
		//convert collection into iterators
		Iterator<String> itr=list.iterator();
		
		while (itr.hasNext())
		{
			String iterator =itr.next();
			System.out.println(iterator);
		}
		
		
		
		
	}

}
