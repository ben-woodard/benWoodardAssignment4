package benWoodardAssignment4;

public class Runnable {

	public static void main(String[] args) {
		FileService fileService = new FileService();
		Student[] dumb = fileService.readStudentFile("student-master-list.csv");
		System.out.println(dumb[0].getInfo());
	}

}
