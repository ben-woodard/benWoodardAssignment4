package com.coderscampus.benWoodardAssignment4;

import java.util.Arrays;
import java.util.Comparator;

public class StudentService {

	public Student[] organizeStudentsByGrade(Student[] inputArray) {
		FileService fileService = new FileService();
		Student[] studentObjectArray = fileService.readStudentFile("student-master-list.csv");

		Arrays.sort(studentObjectArray, new Comparator<Student>() {
			@Override
			public int compare(Student student1, Student student2) {
				if (student1 == null && student2 == null) {
					return 0;
				} else if (student1 == null) {
					return 1;
				} else if (student2 == null) {
					return -1;
				}
				return student1.compareTo(student2);
			}
		});
		return studentObjectArray;
	}
}
