package com.javafeature;

import java.util.Comparator;

public class NameBasedComparator implements Comparator<student> {

	@Override
	public int compare(student o1, student o2) {
		
		return o1.getSname().compareToIgnoreCase(o2.getSname());
	}

}
