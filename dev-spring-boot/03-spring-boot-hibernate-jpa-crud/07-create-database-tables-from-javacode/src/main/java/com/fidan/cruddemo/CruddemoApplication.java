package com.fidan.cruddemo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fidan.cruddemo.dao.StudentDAO;
import com.fidan.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

		return runner -> {
			createMultipleStudents(studentDAO);
		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		
		System.out.println("Deletin all Students");

		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println(numRowsDeleted + " rows deleted");
	}

	private void deleteStudent(StudentDAO sdao) {
		int id =3;
		System.out.println("deleting student id : " + id);
		sdao.delete(id);
		

	}

	private void updateStudent(StudentDAO studentDAO) {

		int studentId = 2;
		System.out.println("Updating student " + studentId);

		Student myStudent = studentDAO.findById(studentId);
		myStudent.setFirstName("Shaq");
		myStudent.setLastName("Oneal");
		studentDAO.update(myStudent);

		System.out.println("Updated student " + myStudent);

	}

	private void queryForStudentsbyLastName(StudentDAO studentDAO) {
		List<Student> theStudents =  studentDAO.findByLastName("Doe");
		for (Student student : theStudents) {
			System.out.println(student);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();

		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		System.out.println("Retrieving student with id: " + 2);
		Student student = studentDAO.findById(2);
		System.out.println(student);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating new student object ...");
		Student tempStudent1 = new Student("John","Doe","john@doe.com");
		Student tempStudent2 = new Student("Mary","Public","public@doe.com");
		Student tempStudent3 = new Student("Bonita","Applebum","bonita@doe.com");
		System.out.println("Creating new student objects ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Paul","Doe","paul@doe.com");
		studentDAO.save(tempStudent);

		System.out.println("Student object created: " + tempStudent.getId());
	}
}
