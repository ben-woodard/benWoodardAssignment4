package com.coderscampus.benWoodardAssignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class FileService {

	// Method to read file and return Array of student objects
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

	// Organize Student[] by grade in descending order via the Student comparable
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

	// write COMPSCI csv method
	public void writeCompSciCsv(Student[] inputStudentArray) {

		try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter("course1.csv"))) {
			fileWriter.write("Student ID, Student Name, Course, Grade\n");
			for (Student student : inputStudentArray) {
				if (student == null) {
					break;
				} else if ((student.getInfo()).contains("COMPSCI")) {
					fileWriter.write(student.getInfo() + "\n");
				}
			}
		} catch (IOException e) {
			System.out.println("IOException writing course1.csv");
			e.printStackTrace();
		}
	}

	// write APMTH csv method
	public void writeApMathCsv(Student[] inputStudentArray) {

		try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter("course2.csv"))) {
			fileWriter.write("Student ID, Student Name, Course, Grade\n");
			for (Student student : inputStudentArray) {
				if (student == null) {
					break;
				} else if ((student.getInfo()).contains("APMTH")) {
					fileWriter.write(student.getInfo() + "\n");
				}
			}
		} catch (IOException e) {
			System.out.println("IOException writing course2.csv");
			e.printStackTrace();
		}
	}

	// write STAT csv method
	public void writeStatCsv(Student[] inputStudentArray) {

		try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter("course3.csv"))) {
			fileWriter.write("Student ID, Student Name, Course, Grade\n");
			for (Student student : inputStudentArray) {
				if (student == null) {
					break;
				} else if ((student.getInfo()).contains("STAT")) {
					fileWriter.write(student.getInfo() + "\n");
				}
			}
		} catch (IOException e) {
			System.out.println("IOException writing course3.csv");
			e.printStackTrace();
		}
	}
	
	//write all 3 csv files
	public void writeCsvAllStudents(Student[] inputStudentArray) {
		writeCompSciCsv(inputStudentArray);
		writeStatCsv(inputStudentArray);
		writeApMathCsv(inputStudentArray);
	}
	
}