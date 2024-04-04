package com.javafeature;

import java.util.Comparator;

public class BranchBasedComparator implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		
		return o1.getSbranch().compareTo(o2.getSbranch());
	}

}
