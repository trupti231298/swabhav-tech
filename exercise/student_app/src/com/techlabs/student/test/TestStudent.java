package com.techlabs.student.test;

import com.techlabs.student.Student;
import com.techlabs.student.Gender;

public class TestStudent {
	public static void main(String args[]) {

		Student s1 = new Student("Jill", 19, 9.8f, 1.6f, 60f, Gender.FEMALE);
		Student s2 = new Student("Jam", 20, 8.5f, 1.5f, 55f, Gender.FEMALE);
		Student s3 = new Student("Jelly", 21, 8.0f, 1.4f, 53f, Gender.FEMALE);

		printDetails(s1);

		System.out.println(s1.howManyStudentsThere());
		System.out.println(Student.getHeadCount());
	}

	public static void printDetails(Student s) {
		System.out.println("Name:" + s.getName());
		System.out.println("Age:" + s.getAge());
		System.out.println("cgpa:" + s.getCGPA());
		System.out.println("height:" + s.getHeight());
		System.out.println("weight:" + s.getWeight());
		System.out.println("Gender:" + s.getGender());
		System.out.println("cgpa in percentage:" + s.convertToPercentage());
		System.out.println("BMI:" + s.calculateBMI());
		System.out.println("BMI status:" + s.getBMIStatus());

	}

}
