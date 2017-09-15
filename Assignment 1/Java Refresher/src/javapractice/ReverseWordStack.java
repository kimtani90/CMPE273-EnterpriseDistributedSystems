/*Write a program to reverse a word using stack.*/
	
package javapractice;

import java.util.Stack;

public class ReverseWordStack {

	public String reverseWord(String word){
		
		Stack<Character> stack = new Stack<>();
		
		StringBuffer reverse=new StringBuffer();
		
		char[] chArr= word.toCharArray();
		
		for(int i=0;i<chArr.length;i++){
			
			stack.push(chArr[i]);
		}
		
		while(!stack.isEmpty()){
			reverse.append(stack.pop());
		}
		
		return reverse.toString();
		
	}
	
}
