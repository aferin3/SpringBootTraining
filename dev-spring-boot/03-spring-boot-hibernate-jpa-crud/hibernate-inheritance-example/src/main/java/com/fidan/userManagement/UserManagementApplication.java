package com.fidan.userManagement;

import com.fidan.userManagement.DAO.PersonalDAO;
import com.fidan.userManagement.entity.Manager;
import com.fidan.userManagement.entity.Personal;
import com.fidan.userManagement.entity.Worker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class UserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(PersonalDAO personalDAO) {
		return runner -> {
			showPersonals(personalDAO);
		};
	}

	private void showPersonals(PersonalDAO personalDAO) {
		List<Personal> personals = personalDAO.findAll();
		for (Personal personal : personals) {
			System.out.println(personal);
		}
	}

	private void deletePersonal(PersonalDAO personalDAO, int id) {
		personalDAO.delete(id);
	}


	private void updatePersonal(PersonalDAO personalDAO, int id) {
		Personal personal = personalDAO.findById(id);
		personal.setName("Ali");
		personalDAO.update(personal);
	}

	private void createPersonal(PersonalDAO personalDAO) {
		Personal personal = new Manager("Eymen","fidan@gmail","123","abc");
		personalDAO.save(personal);
	}


}
