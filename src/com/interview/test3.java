package com.interview;

import java.util.Stack;

public class test3 {

	public static void main(String[] args) {
		String s="{}";
		boolean b= validateStringBracket(s);
		System.out.println(b);
	}

	private static boolean validateStringBracket(String s) {
	
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<=s.length()-1; i++) {
			char ch = s.charAt(i);
			if(ch==')') {
				if(stack.peek()=='(') {
					stack.pop();
				}else {
					return false;
				}
			}else if (ch=='}') {
				if(stack.peek()=='{') {
					stack.pop();
				}else {
					return false;
				}
			}else if(ch==']') {
				if(stack.peek()=='[') {
					stack.pop();
				}else {
					return false;
				}
			}else {
				stack.push(ch);
			}
		}
		if(stack.size()==0) {
			return true;
		}else
			return false;
	}
}
