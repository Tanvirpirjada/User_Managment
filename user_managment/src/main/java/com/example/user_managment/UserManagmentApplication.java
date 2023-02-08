package com.example.user_managment;

import com.example.user_managment.Model.User;
import com.example.user_managment.Service.userService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserManagmentApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserManagmentApplication.class, args);

//		userService.Deletebyname("Tanvir007");
//		System.out.println(userService.Getallusers());
	}

}
