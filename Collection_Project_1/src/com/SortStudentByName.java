package com;

import java.util.Comparator;

public class SortStudentByName implements Comparator<Student>{
	
	public int compare(Student x, Student y) {
		return x.name.compareTo(y.name);
	}

}
//x -> object to be inserted     y ->already existing object
// line:8 -> to compare String objects, calling compareTo() of Sting class
