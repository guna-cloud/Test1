package com.test1;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public 
class NumberComp implements Comparator<Integer> {
	
	public int compare(Integer first, Integer second) {
		
		return first.intValue() - second.intValue();
	}
	
	public void doWork(int i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		Comparator<Integer> n = new NumberComp();
		n.compare(1, 2);
		
		
    Runnable task = () -> {  for (int i=0; i<1000;i++) ((NumberComp) n).doWork(i); };
		
		
    List<String> l = new ArrayList<>();
    
    l.add("abc");
    l.add("jjj");
    
    l.forEach(x -> System.out.println(x));
    
    
    List<String> title = Arrays.asList("java","C","Python");
    
//    Stream<String> s = title.stream();
//    s.filter(w-> isequals(w,"Java")).forEach(System.out::println);
    
    
   try {
	   
	  String st = "aaab ccfr";
	  char c = st.charAt(20);
	  System.out.println(c);
   }  finally {
	   
   }
    
    
    		
    
	}
}

