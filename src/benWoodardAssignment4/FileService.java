package benWoodardAssignment4;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileService {

	public Student[] readStudentFile(String filename) {
		Student[] studentObjectArray = new Student[99];
		String[] studentStringArray = new String[4];
		String line;

		try (BufferedReader fileReader = new BufferedReader(new FileReader(filename));) {
			
			
			int i = 0;
			while ((line = fileReader.readLine()) != null) {
				line = fileReader.readLine();
				studentStringArray = line.split(",");
				studentObjectArray[i] = new Student(studentStringArray);
				i++;
			}
		} catch (Exception e) {
			System.out.println("There was an exception in reading the file");
			e.printStackTrace();
		}
		return studentObjectArray;
	}
}
