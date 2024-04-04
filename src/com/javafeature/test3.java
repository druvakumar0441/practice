package com.javafeature;


import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class test3 {

	public static void main1(String[] args) {
		TreeMap<Integer, student> tm=new TreeMap<Integer, student>();
		tm.put(1, new student(1, "venu", 23, "ece", 25000.0));
		tm.put(2, new student(2, "hari", 26, "cse", 44430.0));
		tm.put(3, new student(3, "praveen", 43, "eee", 55000.0));
		tm.put(4, new student(4, "shiva", 55, "mech", 33300.0));
		tm.put(5, new student(5, "ram", 73, "civil", 11000.0));
		tm.put(6, new student(6, "venu", 33, "ece", 70000.0));
		tm.put(7, new student(7, "hari", 36, "cse", 44430.0));
		tm.put(8, new student(8, "praveen", 53, "eee", 90000.0));
		tm.put(9, new student(9, "shiva", 65, "mech", 60000.0));
		tm.put(10, new student(10, "ram", 83, "civil", 11000.0));
		tm.put(11, new student(11, "prasad", 22, "ece", 80000.0));
		tm.put(12, new student(12, "nani", 38, "cse", 44430.0));
		tm.put(13, new student(13, "abhi", 44, "cse", 99000.0));
		tm.put(14, new student(14, "kiran", 65, "mech", 61000.0));
		tm.put(15, new student(15, "sailu", 87, "civil", 11000.0));
	
		Set<Entry<Integer, student>> set=tm.entrySet();
		
		for (Entry<Integer, student> entry : set) {
			System.out.println(entry);
		}
		
		for (student entry : tm.values()) {
			System.out.println(entry);
		}
		
	}
	
	//insertion based on the key object Hashcode
	public static void main7(String[] args) {
		Hashtable<Integer, student> hm=new Hashtable<Integer, student>();
		hm.put(16, new student(1, "venu", 23, "ece", 25000.0));
		hm.put(2, new student(2, "hari", 26, "cse", 44430.0));
		hm.put(3, new student(3, "praveen", 43, "eee", 55000.0));
		hm.put(4, new student(4, "shiva", 55, "mech", 33300.0));
		hm.put(5, new student(5, "ram", 73, "civil", 11000.0));
		hm.put(6, new student(6, "venu", 33, "ece", 70000.0));
		hm.put(7, new student(7, "hari", 36, "cse", 44430.0));
		hm.put(8, new student(8, "praveen", 53, "eee", 90000.0));
		hm.put(9, new student(9, "shiva", 65, "mech", 60000.0));
		hm.put(10, new student(10, "ram", 83, "civil", 11000.0));
		hm.put(11, new student(11, "prasad", 22, "ece", 80000.0));
		hm.put(12, new student(12, "nani", 38, "cse", 44430.0));
		hm.put(13, new student(13, "abhi", 44, "cse", 99000.0));
		hm.put(14, new student(14, "kiran", 65, "mech", 61000.0));
		hm.put(15, new student(15, "sailu", 87, "civil", 11000.0));
		hm.put(156, new student(157, "sailu", 87, "civil", 11000.0));
		
		
		Set<Entry<Integer, student>> st=hm.entrySet();
		
		for (Entry<Integer, student> entry : st) {
			System.out.println(entry);
		}
		
		Enumeration<Integer> rr=hm.keys();
		while(rr.hasMoreElements()) {
			Integer key = rr.nextElement();
			student st1 = hm.get(key);
			System.out.println(key+"=="+st1);
		}
		
		
	}
	public static void main11(String[] args) {
		HashMap<Integer, student> hm=new HashMap<Integer, student>();
		hm.put(1, new student(1, "venu", 23, "ece", 25000.0));
		hm.put(2, new student(2, "hari", 26, "cse", 44430.0));
		hm.put(3, new student(3, "praveen", 43, "eee", 55000.0));
		hm.put(4, new student(4, "shiva", 55, "mech", 33300.0));
		hm.put(5, new student(5, "ram", 73, "civil", 11000.0));
		hm.put(6, new student(6, "venu", 33, "ece", 70000.0));
		hm.put(7, new student(7, "hari", 36, "cse", 44430.0));
		hm.put(8, new student(8, "praveen", 53, "eee", 90000.0));
		hm.put(9, new student(9, "shiva", 65, "mech", 60000.0));
		hm.put(10, new student(10, "ram", 83, "civil", 11000.0));
		hm.put(11, new student(11, "prasad", 22, "ece", 80000.0));
		hm.put(12, new student(12, "nani", 38, "cse", 44430.0));
		hm.put(13, new student(13, "abhi", 44, "cse", 99000.0));
		hm.put(14, new student(14, "kiran", 65, "mech", 61000.0));
		hm.put(15, new student(15, "sailu", 87, "civil", 11000.0));
		hm.put(15, new student(15, "sailu", 87, "civil", 11000.0));
		hm.put(null ,null);
		hm.put(1143 ,null);hm.put(null ,null);
	
		Set<Entry<Integer, student>> enumc =hm.entrySet();
		for (Entry<Integer, student> entry : enumc) {
			System.out.println(entry);
		}System.out.println("==========================================");
		
		hm.forEach((key, values)->{
			System.out.println(key+"=="+values);
		});
		System.out.println("==========================================");
		hm.putIfAbsent(1212, null);
		hm.forEach((key, values)->{
			System.out.println(key+"=="+values);
		});
	}
	public static void main(String[] args) {
		LinkedHashMap<Integer, student> hm=new LinkedHashMap<Integer, student>();
		hm.put(11, new student(1, "venu", 23, "ece", 25000.0));
		hm.put(22, new student(2, "hari", 26, "cse", 44430.0));
		hm.put(3, new student(3, "praveen", 43, "eee", 55000.0));
		hm.put(4, new student(4, "shiva", 55, "mech", 33300.0));
		hm.put(5, new student(5, "ram", 73, "civil", 11000.0));
		hm.put(6, new student(6, "venu", 33, "ece", 70000.0));
		hm.put(7, new student(7, "hari", 36, "cse", 44430.0));
		hm.put(8, new student(8, "praveen", 53, "eee", 90000.0));
		hm.put(9, new student(9, "shiva", 65, "mech", 60000.0));
		hm.put(10, new student(10, "ram", 83, "civil", 11000.0));
		hm.put(11, new student(11, "prasad", 22, "ece", 80000.0));
		hm.put(12, new student(12, "nani", 38, "cse", 44430.0));
		hm.put(13, new student(13, "abhi", 44, "cse", 99000.0));
		hm.put(14, new student(14, "kiran", 65, "mech", 61000.0));
		hm.put(15, new student(15, "sailu", 87, "civil", 11000.0));
		hm.put(15, new student(15, "sailu", 87, "civil", 11000.0));
		hm.put(null ,null);hm.put(null ,null);hm.put(null ,null);
		hm.put(1143 ,null);hm.put(null ,null);
	
		Set<Entry<Integer, student>> enumc =hm.entrySet();
		for (Entry<Integer, student> entry : enumc) {
			System.out.println(entry);
		}System.out.println("==========================================");
		
		Set<Integer> set= hm.keySet();
		System.out.println(set);
		
		
		
	}
}
