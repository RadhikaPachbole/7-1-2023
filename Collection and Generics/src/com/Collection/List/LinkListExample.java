package com.Collection.List;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListExample {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();  
		  al.add("C");  
		  al.add("C++");  
		  al.add("Java");  
		  al.add("Kotlin");
		  al.add("Python");
		  al.add("Perl");
		  al.add("Ruby");
		  Iterator<String> itr=al.iterator(); 
		  System.out.println("Display The Created List :");
		  while(itr.hasNext()){  
			  System.out.println(itr.next());  
		  }
		  System.out.println("****************************************");
		  System.out.println("");

		  System.out.println("Remove Element from List  :");
		  al.remove(5);
		  Iterator<String> itr1=al.iterator(); 
		  System.out.println("Display The List after romoval of Index 5:");
		  while(itr1.hasNext()){  
			  System.out.println(itr1.next());  
		  }
		  System.out.println("Removed Index Value :"+al.remove(5));
		  System.out.println("****************************************");
		  System.out.println("");

		  System.out.println("Removed Word in the List :"+al.remove(3));
		  al.remove("Kotlin");
		  Iterator<String> itr2=al.iterator(); 
		  System.out.println("Display The List after romoval of Kotlin Word :");
		  while(itr2.hasNext()){  
			  System.out.println(itr2.next());  
		  }
		  System.out.println("****************************************");
		  LinkedList<String> a=new LinkedList<String>();  
		  a.add("C");  
		  a.add("C++");  
		  a.add("Java");  
		  a.add("Kotlin");
		  a.add("Python");
		  a.add("Perl");
		  a.add("Ruby");
		  Iterator<String> itr3=a.iterator(); 
		  System.out.println("Display The Created List :");
		  while(itr3.hasNext()){  
			  System.out.println(itr3.next());  
		  }
		  a.subList(4,7).clear();
		  System.out.println("After Removing of Scripting Language  DIplay the list :");
		  System.out.println(a);
		  System.out.println("****************************************");
		  System.out.println("Remove All the Elements From the Link List :");  
		  a.clear();
		  System.out.println("Removing all the elements in the Link List :"+a);
		  
		  
		  
	}

}
