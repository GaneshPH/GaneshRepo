package com.xworkz.oct11;

import com.xworkz.oct11.boot.*;

public class DeveloperRunner {

	public static void main(String[] args) {
		
		Developer develops = new Developer();
		develops.name="abc";
		develops.education="B.E";
		develops.experience="5years";
		develops.salary=250000;
		develops.company="XYZ";
		
		System.out.println(develops.name);
		System.out.println(develops.education);
		System.out.println(develops.experience);
		System.out.println(develops.salary);
		System.out.println(develops.company);

	}

}
