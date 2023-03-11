package com;

import java.util.Comparator;

public class SortstudentById implements Comparator<Student>{

	public int compare(Student x, Student y) {
		return x.id - y.id;  //Descending y.id - x.id;
	}
}

//x -> object to be inserted     y ->already existing object