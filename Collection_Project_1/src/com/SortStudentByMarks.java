package com;

import java.util.Comparator;

public class SortStudentByMarks implements Comparator<Student>{
	
	public  int compare(Student x, Student y) {
		return x.marks - y.marks;
	}

}
