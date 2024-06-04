package collection.practice;


import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
                           

public class CollectionDemo  {

	public static void main(String[] args) {
		CollectionDemo c=new CollectionDemo();
	     //c.learnHashSet();
		//c.learnVector();
		//c.learnLinkedList();
		//c.learnArrayList();
		//c.learnLinkedHashSet();
		//c.learnTreeSet();
		//c.freqOfEachChar();
		//c.findDuplicate();
		//c.learnHashMap();
		c.linkedHashMap();
		c.learnHashMap1();
		//c.learnTreeMap();
		//c.arrayListDemo();
		//c.learnArrayListDemo();
		//c.learnArrayListDemo1();
		//c.merge();
		//c.intersection();
	}
	

	private void learnTreeMap()//it not maintain order 
	{
		TreeMap<String, Integer> hm = new TreeMap<String, Integer>();// in generic we should give the wrapper class ,here it has two generic because map has key:values
		hm.put("java", 100);
		hm.put("php", 90);
		hm.put("C#", 100);
		hm.put("python", 100);
		hm.put("ruby", 95);
		System.out.println(hm);
		System.out.println(hm.get("php"));
		System.out.println(hm.containsValue(100));
		System.out.println(hm.containsKey("javascript"));
		
		//bellow three method is called collection view of map
		System.out.println(hm.entrySet());
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		
	}


	private void linkedHashMap() //it maintain order
	{
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();// in generic we should give the wrapper class ,here it has two generic because map has key:values
		hm.put("java", 100);//it store like key:value
		hm.put("php", 90);
		hm.put("C#", 100);
		hm.put("python", 100);
		hm.put("ruby", 95);
		System.out.println(hm);
		System.out.println(hm.get("php"));//it give values not key
		System.out.println(hm.containsValue(100));//it return boolean
		System.out.println(hm.containsKey("javascript"));//it return boolean
		
		//bellow three method is called collection view of map
		System.out.println(hm.entrySet());//it give the map
		System.out.println(hm.values());//it give value
		System.out.println(hm.keySet());
		
	}


	private void learnHashMap() //not maintain order
	{
		/*HashMap<String, Integer> hm = new HashMap<String, Integer>();// in generic we should give the wrapper class ,here it has two generic because map has key:values
		hm.put("java", 100);
		hm.put("php", 90);
		hm.put("C#", 100);
		hm.put("python", 100);
		hm.put("ruby", 95);
		System.out.println(hm);//in these it give values inside crulybrace
		System.out.println(hm.get("php"));
		System.out.println(hm.containsValue(100));
		System.out.println(hm.containsKey("javascript"));
		
		//bellow three method is called collection view of map
		System.out.println(hm.entrySet());// in this give values in square bracket
		System.out.println(hm.values());
		System.out.println(hm.keySet());*/
		
		
		
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("java", 100);
		hm.put("php", 90);
		hm.put("C#", 100);
		hm.put("python", 100);
		hm.put("ruby", 95);
		System.out.println(hm);
		Set s = hm.keySet();
		System.out.println("keys are... " + s);
		Collection collect = hm.values();
		System.out.println("values are ..." + collect);
		Set s1 = hm.entrySet();
		System.out.println("entry set.."+s1);
	}

	
	private void learnHashMap1() {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("java", 100);
		hm.put("php", 90);
		hm.put("C#", 100);
		hm.put("python", 100);
		hm.put("ruby", 95);
		System.out.println(hm);
		
		Set s = hm.keySet();
		System.out.println("keys are " + s);
		Collection collect = hm.values();
		System.out.println("values are " + collect);
		Set s1 = hm.entrySet();
		System.out.println("Entries are " + s1);

		Iterator it = s1.iterator();
		while (it.hasNext())
		{
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey() + ":" + me.getValue());
			// System.out.println(it.next());

			if (me.getKey().equals("php")) {
				System.out.println(me.getValue());
				me.setValue(58);
				System.out.println(me.getValue());
			}
		}

	}

	private void learnTreeSet()//it accept single data type data only  if we give different data in throws classcastException ,it is homogenous 
	{
		TreeSet<Float> a=new TreeSet<>();//here <Float> is generic to avoid the exception
		a.add(5.6f);       
		a.add(3.4f);//it not allow duplicate value
		a.add(3.5f);
		System.out.println(a+" ");
		
		TreeSet<String>a2=new TreeSet();//this <String> is for only string data to store it is generic 
		 a2.add("A");  
         a2.add("B");  
         a2.add("C");  
         a2.add("D");  
         a2.add("E");  
         System.out.println("Initial Set: "+a2);  
           
         System.out.println("Reverse Set: "+a2.descendingSet());  
         
         System.out.println("first set:"+a2.first());
         
         System.out.println("last set:"+a2.last());
           
         System.out.println("Head Set: "+a2.headSet("C"));  
          
         System.out.println("SubSet: "+a2.subSet("A", false, "E", true));  
           
         System.out.println("TailSet: "+a2.tailSet("C"));  
 }  

	private void learnLinkedHashSet()//it not index based but maintain order not allow duplicate values
	{	
	LinkedHashSet a=new LinkedHashSet();
		a.add("hello");
		a.add("hello");//it not allow duplicate value
		a.add(3);
		a.add(3.4f);
		a.add(true);
		a.add('e');
		System.out.println(a+" ");
		System.out.println(a.contains("hello"));//check and return true or false
		//a.clear();
		//System.out.println(a);
		
		
		LinkedHashSet a1=new LinkedHashSet();
		a1.add(a);
		a1.add(3);
		a1.add("muthu");
		a1.add('y');
		a1.remove(3);
		System.out.println(a1+" ");
		
	}
	private void learnHashSet()//it not index based not maintain order not allow duplicate values
	{
		HashSet a=new HashSet();
		a.add("hello");
		a.add("hello");//it not allow duplicate value
		a.add(3);
		a.add(3.4f);
		a.add(true);
		a.add('e');
		a.add(2);//it give index value and string name
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a+" ");
		System.out.println(a.contains("hello"));//check and return true or false
		//a.clear();
		//System.out.println(a);
		
		HashSet a1=new HashSet();
		a1.add(a);
		a1.add(3);
		a1.add("muthu");
		a1.add('y');
		a1.remove(2);
		System.out.println(a1+" ");
		
		
	}
	private void learnVector() 
	{
		Vector a=new Vector(3);//in vector the capacity also give if size is exist it double the capacity value
		a.add("hello");
		a.add("hello");//it allow duplicate value, maintain insertion order
		a.add(3);
		a.add(3.4f);
		a.add(true);
		a.add('e');
		System.out.println(a);
		for(Object items:a)//in this colloction every thing is object so here we use Object class to store all data
		{
			System.out.println(items);
		System.out.println(items.getClass());
		}
		System.out.println(a.capacity());//to know the size
		
	}
	private void learnLinkedList()
	{
		LinkedList a=new LinkedList();
		a.add("hello");
		a.add("hello");//it allow duplicate value
		a.add(3);
		a.add(3.4f);
		a.add(true);
		a.add('e');
		a.add(2,"flash");//it give index value and string name
		System.out.println(a+" ");
		System.out.println(a.contains("hello"));//check and return true or false
		System.out.println(a.get(6));//get what is in index6
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		//a.clear();
		//System.out.println(a);
		
		
		LinkedList a1 = new LinkedList();
		a1.add(a);
		a1.add(3);
		a1.add("muthu");
		a1.add('y');
		//a1.remove(2);
		System.out.println(a1+" ");
		System.out.println(a1.indexOf(3));//this method for 3  index value
		List li=a1.subList(0,3);//it give 0 index to 2 index 
		System.out.println(li);		
	}
	
	
	private void learnArrayList()// it is hetrogenous ,it allow dulicate value 
	                            //it maintain insertion order
	{
		ArrayList a=new ArrayList();
		a.add("hello");
		a.add("hello");//it allow duplicate value
		a.add(3);
		a.add(3.4f);
		a.add(true);
		a.add('e');
		a.add(2,"flash");//it give index value and string name
		System.out.println(a.contains("hello"));//check and return true or false
		System.out.println(a.get(6));//get what is in index6
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		//a.clear();
		//System.out.println(a);
		
		// Iterating through elements using Iterator
		Iterator itr = a.iterator(); // specify the data type
		while (itr.hasNext()) {
		    System.out.println(itr.next());
		}
		  
		
		ArrayList a1 = new ArrayList();
		a1.add(a);
		a1.add(3);
		a1.add("muthu");
		a1.add('y');
		//a1.remove(2);
		System.out.println(a1+" ");
		System.out.println(a1.indexOf(2));//this method for 3 value index
		List li=a1.subList(0,3);//it give 0 index to 2 index 
		System.out.println(li);
		
	}
	
	
	private void arrayListDemo() 
	{
		ArrayList al=new ArrayList();
		al.add(55);
		al.add(35);
		al.add(45);
		System.out.println("before sortintg ");
		System.out.println(al);
		System.out.println("ascending order ");
		Collections.sort(al);
		System.out.println("descending order");
		Collections.reverse(al);	
	}
	
	
	
	private void learnArrayListDemo()
	{
		ArrayList al=new ArrayList();
		al.add(45);
		al.add(4.5f);
		al.add("muthu");
		al.add("ram");
		al.add('h');
		al.add(true);
		
		for(Object element:al)
		{
			try 
			{
				Integer no=(Integer) element;//here we typecast to integer to get only int values for string change to string
				System.out.println(no);
			}
			catch(ClassCastException c)
			{
				System.out.println(c.getMessage());
			}
		}

	}
	
	
	private void learnArrayListDemo1()
	{
		ArrayList al=new ArrayList();
		al.add(45);
		al.add(4.5f);
		al.add("muthu");
		al.add("ram");
		al.add('h');
		al.add(true);
		//to iterator the list
		Iterator i=al.iterator();
		while(i.hasNext());
		{
			System.out.println(i.next());
		}
		 
		/*for(int i=0;i<al.size();i++)//al.size() for take length
		{
			System.out.println(al.get(i));
		}*/
	}
		
	
	
	private void findDuplicate() 
	{
		List<Integer> listWithDuplicates = Arrays.asList(1, 2, 3, 4, 1, 2, 5);
		Set<Integer> set = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for (Integer element : listWithDuplicates) 
		{
			if (!set.add(element)) 
			{ // If the element is already in the set, it's a duplicate
				duplicates.add(element);
			}
		}
		System.out.println("set: " + set);
		System.out.println("Duplicates: " + duplicates); // Output: Duplicates: [1, 2]
	}
	
	
	private void freqOfEachChar() {
		String word = "batman";
		LinkedHashMap hm = new LinkedHashMap();//use linked hashmap to maintain order
		char[] ch = word.toCharArray();
		for (char letter : ch) 
		{
			if (hm.containsKey(letter)) 
			{
				Integer value = (Integer) hm.get(letter);//here we typecast to integer for value data
				hm.put(letter, value + 1);
			} 
			else 
			{
				hm.put(letter, 1);
			}
		}
		Set s = hm.entrySet();
		for (Object obj : s) 
		{
			Entry entry = (Entry) obj;
			System.out.println(entry);
		}
	}
	
	
	public void merge()
	{
		ArrayList a=new ArrayList();
		a.add(45);
		a.add(54);
		a.add(78);
		a.add(65);
	   
	   ArrayList a1=new ArrayList();
	     a1.add(a);
		a1.add(54);
		a1.add(88);
		a1.add(27);
		a1.add(45);
		System.out.println("merge arraylist..");
		System.out.println(a1+" ");
	
		
	}
	
	
	public void intersection()
	{
		ArrayList a=new ArrayList();
		a.add(45);
		a.add(54);
		a.add(78);
		a.add(65);
		System.out.println(a);
		
	   
	   ArrayList a1=new ArrayList();
		a1.add(54);
		a1.add(88);
		a1.add(27);
		a1.add(45);
		System.out.println(a1);
		ArrayList  intersection = new ArrayList(a1);
		
        // Find the intersection
        intersection.retainAll(a);
        System.out.println("Intersection: "+intersection);
    }

}
