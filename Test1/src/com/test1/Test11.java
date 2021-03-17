package com.test1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test11 { // implements Lambda1{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p = 1 << 10;
		
		System.out.println(p);
		
		BigDecimal b = BigDecimal.valueOf(2, 1);
		
		System.out.println(b.toString());
		
		List<String> friends  = new ArrayList<>() ;
		
		friends.add("G");
		friends.add(0,"H");
	
		System.out.println(friends);
		
		LocalDate d = LocalDate.of(2021, 03, 03);
		
	   Test11 t1 = new Test11();
	   
	   
	   // 	(s1, s2) -> System.out.println(s1+s2);
	
	   	String s1 = "one";
	   	String s2 = "two";
/*	   t1.concat( 
		 (String s11,String s22) ->  return (s11+s22)
	   );*/
	  
	 Lambda1 l1 = (String s3, String s4) -> { return (s4+s3); };
	 
	 l1.getSum("a","a");
	 
	 System.out.println(l1.getSum("a","a"));
	 
	 String a = t1.concat((String s3, String s4) -> { return (s4+s3); });
	 System.out.println("a="+a);
	 
	 
     Predicate<Integer> greaterThanTen = (i) -> i > 10; 
     
     // Creating predicate 
     Predicate<Integer> lowerThanTwenty = (i) -> i < 20;  
     boolean result = greaterThanTen.and(lowerThanTwenty).test(15); 
     System.out.println(result); 

     // Calling Predicate method 
     boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15); 
     System.out.println(result2); 
	 
	 
	 int arr1[] = {1,2,3};
	 
	 int arr2[] = new int[] {1,2,3,4};
	 
	 int []arr3 = new int[3];
	 
	
	 System.out.println("abcd".replace('a','z' ));
	 
	 StringBuffer sb = new StringBuffer();
	 sb.append(4);
	 sb.append("bcd");
	 
	 System.out.println(sb);
	 
	 String strToChk = "Testing This";
	 Pattern p2 = Pattern.compile("[a-z]+");
	 
	 Matcher m = p2.matcher(strToChk);
	 
	 while (m.find() ) {
		 System.out.println(strToChk.substring(m.start(), m.end()));
		 
	 }
	 
	 int[] arr={7,5,6,1,4,2};
	 int n=arr.length+1;
     int sum=n*(n+1)/2;
     int restSum=0;
     for (int i = 0; i < arr.length; i++) {
         restSum+=arr[i];
     }
     int missingNumber=sum-restSum;
     System.out.println(missingNumber);
	 
	  Comparator<Integer> cc = new NumberComp();

	  cc.compare(3, 5);
	}
	
	  public String concat(Lambda1 l2) {
	  
		// l2 =  (String s3, String s4) -> { return (s4+s3); };
		 return l2.getSum("this","that");
	   }
	  
	  
	  public String getSum(String ss, String qq) {
		  return ss + qq;
	  }
	  

	  
}

/*
 * interface Comparable><T? {
 * 
 * public int compareTo(T other);
 * 
 * }
 */





