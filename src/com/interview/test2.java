package com.interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class test2 {

	//sum of even,  odd using Streams
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,5,6,8,9);
		int even=list.stream().filter(s-> s%2==0).mapToInt(Integer::intValue).sum();
		
		System.out.println(even);
		int odd=list.stream().filter(s->s%2==1).mapToInt(Integer::intValue).sum();
		
		System.out.println(even+"==="+odd);
	}
}
