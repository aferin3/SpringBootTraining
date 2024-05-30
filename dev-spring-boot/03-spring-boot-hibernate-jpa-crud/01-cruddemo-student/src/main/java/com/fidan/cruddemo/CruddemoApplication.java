package com.fidan.cruddemo;

import com.fidan.cruddemo.dao.StudentDAO;
import com.fidan.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Paul","Doe","paul@doe.com");
		studentDAO.save(tempStudent);

		System.out.println("Student object created: " + tempStudent.getId());
	}
}
