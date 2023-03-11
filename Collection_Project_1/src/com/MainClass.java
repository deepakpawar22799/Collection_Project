package com;

import java.util.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		Student s1=new Student(100, "Tom", 45);
		Student s2=new Student(200, "som", 55);
		Student s3=new Student(300, "mom", 45);

		Map<Integer, Student> map=new LinkedHashMap<Integer, Student>();

		map.put(s1.id, s1);
		map.put(s2.id, s2);
		map.put(s3.id, s3);

		//converting Map into Set of key using keySet()
		Set<Integer> keys= map.keySet();

		//creating instance of ArrayList & storing it into List reference
		List<Student> l = new ArrayList<Student>();

		//Traversing Keys from Set
		for(int key : keys) {
			Student std = map.get(key);// getting value(student object)
			l.add(std);                // Adding value(student object) into ArrayList  
			System.out.println(std);   // printing value(student object)
		}
		System.out.println("------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1:Sort Student By Id\n2:Sort Student By Name\n3:Sort Student By Marks\nEnter Choice");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			Collections.sort(l, new SortstudentById());
			for(Student student :l) {
				System.out.println(student);
				
			}
			break;
			
		case 2:
			Collections.sort(l, new SortStudentByName());
			for(Student student :l) {
				System.out.println(student);
				
			}
			break;
			
		case 3:
			Collections.sort(l, new SortStudentByMarks());
			for(Student student :l) {
				System.out.println(student);
				
			}
			break;
			
		}
		
	}

}





















