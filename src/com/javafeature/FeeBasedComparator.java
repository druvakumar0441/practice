package com.javafeature;

import java.util.Comparator;

public class FeeBasedComparator implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		return o1.getSfee().compareTo(o2.getSfee());
	}

}
