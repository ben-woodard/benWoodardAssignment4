package com.coderscampus.benWoodardAssignment4;

public class StudentsByClassApplication {

	public static void main(String[] args) {
		FileService fileService = new FileService();
		StudentService studentService = new StudentService();

		Student[] unorganizedStudentArray = fileService.readStudentFile("student-master-list.csv");
		Student[] organizedStudentArray = studentService.organizeStudentsByGrade(unorganizedStudentArray);

		fileService.writeCsvAllStudents(organizedStudentArray);
	}
}
