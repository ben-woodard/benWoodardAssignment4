package benWoodardAssignment4;

public class Runnable {

	public static void main(String[] args) {
		FileService fileService = new FileService();

		Student[] studentStringArray = fileService.readStudentFile("student-master-list.csv");
		Student[] studentObjectArray = fileService.organizeStudentsByGrade(studentStringArray);

		fileService.writeCsvAllStudents(studentObjectArray);
	}
}
