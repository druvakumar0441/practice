package com.javafeature;


import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;


public class test2 {

	public static void main(String[] args) {
		student s1= new student(1, "venu", 23, "ece", 25000.0);
		student s2= new student(2, "hari", 26, "cse", 44430.0);
		student s3= new student(3, "praveen", 43, "eee", 55000.0);
		student s4= new student(4, "shiva", 55, "mech", 33300.0);
		student s5= new student(5, "ram", 73, "civil", 11000.0);
		student s6= new student(6, "venu", 33, "ece", 70000.0);
		student s7= new student(7, "hari", 36, "cse", 44430.0);
		student s8= new student(8, "praveen", 53, "eee", 90000.0);
		student s9= new student(9, "shiva", 65, "mech", 60000.0);
		student s10= new student(10, "ram", 83, "civil", 11000.0);
		student s11= new student(11, "prasad", 22, "ece", 80000.0);
		student s12= new student(12, "nani", 38, "cse", 44430.0);
		student s13= new student(13, "abhi", 44, "cse", 99000.0);
		student yy= new student(13, "abhi", 63, "cse", 99000.0);
		student yyy= new student(13, "abhi", 44, "cse", 99000.0);
		student s14= new student(14, "kiran", 65, "mech", 61000.0);
		student s141= null;
		student s15= new student(15, "sailu", 87, "civil", 11000.0);
		
		HashSet<student> hs = new HashSet<student>();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);
		hs.add(s7);
		hs.add(s8);
		hs.add(s9);
		hs.add(s10);
		hs.add(s11);hs.add(s8);hs.add(s8);hs.add(s8);
		hs.add(s12);hs.add(null);hs.add(null);hs.add(null);
		hs.add(s13);
		hs.add(s14);hs.add(s141);
		hs.add(s15);
		hs.add(s8);hs.add(yyy);
		Iterator<student> li=hs.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
			
			
		}
		
	}
	public static void main3(String[] args) {

		student s1= new student(1, "venu", 23, "ece", 25000.0);
		student s2= new student(2, "hari", 26, "cse", 44430.0);
		student s3= new student(3, "praveen", 43, "eee", 55000.0);
		student s4= new student(4, "shiva", 55, "mech", 33300.0);
		student s5= new student(5, "ram", 73, "civil", 11000.0);
		student s6= new student(6, "venu", 33, "ece", 70000.0);
		student s7= new student(7, "hari", 36, "cse", 44430.0);
		student s8= new student(8, "praveen", 53, "eee", 90000.0);
		student s9= new student(9, "shiva", 65, "mech", 60000.0);
		student s10= new student(10, "ram", 83, "civil", 11000.0);
		student s11= new student(11, "prasad", 22, "ece", 80000.0);
		student s12= new student(12, "nani", 38, "cse", 44430.0);
		student s13= new student(13, "abhi", 44, "cse", 99000.0);
		student yy= new student(13, "abhi", 63, "cse", 99000.0);
		student yyy= new student(13, "abhi", 93, "cse", 99000.0);
		student s14= new student(14, "kiran", 65, "mech", 61000.0);
		student s141= new student(14, "kiran", 88, "mech", 61000.0);

		student s15= new student(15, "sailu", 87, "civil", 11000.0);
		System.out.println("Enter Property");
		Scanner s = new Scanner(System.in);
		String property=s.next();
		Comparator<student> comp = null;
		
		if(property.equals("name")) {
			comp=new NameBasedComparator();
		}else if (property.equals("branch")) {
			comp=new BranchBasedComparator();
		}else if (property.equals("age")) {
			comp=new AgeBasedComparator();
		}else if (property.equals("fee")) {
			comp=new FeeBasedComparator();
		}else
			comp=null;
		TreeSet<student> hs = new TreeSet<student>(comp);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);
		hs.add(s7);
		hs.add(s8);
		hs.add(s9);
		hs.add(s10);
		hs.add(s11);
		hs.add(s12);
		hs.add(s13);
		hs.add(s14);
		hs.add(s15);
		
		Iterator<student> li=hs.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	
	}
	public static void main4(String[] args) {


		student s1= new student(1, "venu", 23, "ece", 25000.0);
		student s2= new student(2, "hari", 26, "cse", 44430.0);
		student s3= new student(3, "praveen", 43, "eee", 55000.0);
		student s4= new student(4, "shiva", 55, "mech", 33300.0);
		student s5= new student(5, "ram", 73, "civil", 11000.0);
		student s6= new student(6, "venu", 33, "ece", 70000.0);
		student s7= new student(7, "hari", 36, "cse", 44430.0);
		student s8= new student(8, "praveen", 53, "eee", 90000.0);
		student s9= new student(9, "shiva", 65, "mech", 60000.0);
		student s10= new student(10, "ram", 83, "civil", 11000.0);
		student s11= new student(11, "prasad", 22, "ece", 80000.0);
		student s12= new student(12, "nani", 38, "cse", 44430.0);
		student s13= new student(13, "abhi", 44, "cse", 99000.0);
		student yy= new student(13, "abhi", 63, "cse", 99000.0);
		student yyy= new student(13, "abhi", 93, "cse", 99000.0);
		student s14= new student(14, "kiran", 65, "mech", 61000.0);
		student s141= new student(14, "kiran", 88, "mech", 61000.0);

		student s15= new student(15, "sailu", 87, "civil", 11000.0);
		
		LinkedHashSet<student> hs = new LinkedHashSet<student>();
		hs.add(s8);
		hs.add(s9);
		hs.add(s10);
		hs.add(s11);
		hs.add(s12);
		hs.add(s13);
		hs.add(s14);
		hs.add(s15);
		hs.add(s1);
		hs.add(s4);
		hs.add(s5);
		hs.add(s2);
		hs.add(s15);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);
		hs.add(s7);
		hs.add(null);hs.add(null);hs.add(null);hs.add(null);hs.add(null);
		hs.add(s7);
	
		
		Iterator<student> li=hs.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	
	
	}
}
