package com.javafeature;

import java.util.Comparator;

public class AgeBasedComparator implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		
		return o1.getSage().compareTo(o2.getSage());
	}

}
