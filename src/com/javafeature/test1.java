package com.javafeature;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class test1 {

	//Intermediate methods	
	public static void main(String[] args) {
		student s1= new student(1, "venu", 23, "ece", 25000.0);
		student s2= new student(2, "hari", 26, "cse", 44430.0);
		student s3= new student(3, "praveen", 43, "eee", 55000.0);
		student s4= new student(4, "shiva", 55, "mech", 33300.0);
		student s5= new student(5, "ram", 73, "civil", 11000.0);
		student s6= new student(6, "venu", 23, "ece", 70000.0);
		student s7= new student(7, "hari", 36, "cse", 44430.0);
		student s8= new student(8, "praveen", 43, "eee", 90000.0);
		student s9= new student(9, "shiva", 65, "mech", 60000.0);
		student s10= new student(10, "ram", 83, "civil", 11000.0);
		student s11= new student(11, "prasad", 23, "ece", 80000.0);
		student s12= new student(12, "nani", 36, "cse", 44430.0);
		student s13= new student(13, "abhi", 43, "cse", 90000.0);
		student yy= new student(13, "abhi", 43, "cse", 99000.0);
		student s14= new student(14, "kiran", 65, "mech", 61000.0);
		student s15= new student(15, "sailu", 83, "civil", 11000.0);

		List<student> slist = Arrays.asList(s6, s7, s8,s9,s10,s1, s2, s3, s4,s5,s11,
								s12, s13, yy,s14, s15);
		
		ListIterator<student> li=slist.listIterator();
		
		slist.stream().map((s)->{
			s.setSfee(s.getSfee()+1000);
			return s;
		}).filter(s->{
			if(s.getSfee()>=50000)
				return true;
			else
				return false;
		}).sorted((s, y)->{
			return -s.getSname().compareToIgnoreCase(y.getSname());
		}).limit(10).skip(2)
		.forEach(s->{
			System.out.println(s);
		});
	}
	//Terminal methods	
	public static void main2(String[] args) {
		student s1= new student(1, "venu", 23, "ece", 25000.0);
		student s2= new student(2, "hari", 26, "cse", 44430.0);
		student s3= new student(3, "praveen", 43, "eee", 55000.0);
		student s4= new student(4, "shiva", 55, "mech", 33300.0);
		student s5= new student(5, "ram", 73, "civil", 11000.0);
		student s6= new student(6, "venu", 23, "ece", 70000.0);
		student s7= new student(7, "hari", 36, "cse", 44430.0);
		student s8= new student(8, "praveen", 43, "eee", 90000.0);
		student s9= new student(9, "shiva", 65, "mech", 60000.0);
		student s10= new student(10, "ram", 83, "civil", 11000.0);
		student s11= new student(11, "prasad", 23, "ece", 80000.0);
		student s12= new student(12, "nani", 36, "cse", 44430.0);
		student s13= new student(13, "abhi", 43, "cse", 90000.0);
		student yy= new student(13, "abhi", 43, "cse", 99000.0);
		student s14= new student(14, "kiran", 65, "mech", 61000.0);
		student s16= new student(14, "o", 65, "mech", 61000.0);
		student s15= new student(15, "sailu", 83, "civil", 71000.0);

		List<student> slist = Arrays.asList(s6, s7, s8, 
								yy,s9,s10,s1, s2, s3, s4,s5,s11,
								s12, s13, s14, s15, s16);
		
		Optional<student> co=slist.stream().map((s)->{
			s.setSfee(s.getSfee()+1000);
			return s;
		}).filter(s->{
			if(s.getSfee()>=30000 && s.getSfee()<=80000)
				return true;
			else
				return false;
		}).sorted((s, y)->{
			return s.getSname().compareToIgnoreCase(y.getSname());
		}).limit(10).skip(0)
				.findAny();		
		
			System.out.println(co);
		
	}

}
