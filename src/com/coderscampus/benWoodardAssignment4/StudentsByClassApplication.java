package com.coderscampus.benWoodardAssignment4;

public class StudentsByClassApplication {

	public static void main(String[] args) {
		FileService fileService = new FileService();
		StudentService studentService = new StudentService(fileService);
		StudentCourseReportService reportService = new StudentCourseReportService(studentService, fileService);

		reportService.generateStudentCourseReportByCourse("COMPSCI", "course1.csv");
		reportService.generateStudentCourseReportByCourse("APMTH", "course2.csv");
		reportService.generateStudentCourseReportByCourse("STAT", "course3.csv");
	}
}
