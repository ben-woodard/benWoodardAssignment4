package benWoodardAssignment4;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileService {

	public Student[] readStudentFile(String filename) {
		Student[] studentObjectArray = new Student[150];
		String[] studentStringArray = new String[4];

		try (BufferedReader fileReader = new BufferedReader(new FileReader(filename));) {
			
			
			int i = 0;
			String line = fileReader.readLine();
			while ((line = fileReader.readLine()) != null) {
				studentStringArray = line.split(",");
				studentObjectArray[i] = new Student(studentStringArray);
				i++;
			}
		} catch (Exception e) {
			System.out.println("There was an exception while reading the file.");
			e.printStackTrace();
		}
		return studentObjectArray;
	}
}
