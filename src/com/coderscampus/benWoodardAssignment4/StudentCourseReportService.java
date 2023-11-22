package com.coderscampus.benWoodardAssignment4;

public class StudentCourseReportService {

	private StudentService studentService;
	private FileService fileService;

	public StudentCourseReportService(StudentService studentService, FileService fileService) {
		this.studentService = studentService;
		this.fileService = fileService;
	}

	public void generateStudentCourseReportByCourse(String course, String exportFilename) {
		Student[] courseStudents = studentService.filterStudentsByCourse(course);

		fileService.writeStudentCsv(courseStudents, exportFilename);
	}
}
