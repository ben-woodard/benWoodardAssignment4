package benWoodardAssignment4;

public class Runnable {

	public static void main(String[] args) {
		FileService fileService = new FileService();
		Student[] joe = fileService.readStudentFile("student-master-list.csv");
		Student[] allen = fileService.organizeStudentsByGrade(joe);
		for(Student student : allen) {
			System.out.println(student.getInfo());
		}
	}

}
