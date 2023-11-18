package benWoodardAssignment4;

public class Runnable {

	public static void main(String[] args) {
		FileService fileService = new FileService();
		Student[] joe = fileService.readStudentFile("student-master-list.csv");
		Student[] dumb = fileService.organizeStudentsByGrade(joe);
		for(Student poop : dumb) {
			System.out.println(poop.getInfo());
		}
	}

}
