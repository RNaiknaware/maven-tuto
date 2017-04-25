package com.example;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
public class Greeting {

	public int count_words(String line) {
			String[] words =	StringUtils.split(line,' ');
			return (words == null)? 0 : words.length;
	}


	public void greet(){
		List<String> lst = new ArrayList<String>();
		
		lst.add("Hello ");
		lst.add("Maven");
		
		for(String ele : lst){
			System.out.println("Greeting "+ele);
		}
		
		System.out.println("-----------------------------");
	}

	public static void main(String[] args) {
			System.out.println("-------------------------------------");
			System.out.println("Greeting card");
			System.out.println("Good Morning");
			System.out.println("-------------------------------------");
			Greeting greets = new Greeting();
			greets.greet();
			
			System.out.println("count : "+greets.count_words("Hello ru;shi how are you"));
			

	}

}
