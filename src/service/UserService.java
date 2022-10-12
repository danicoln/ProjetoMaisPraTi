package service;

import java.util.Scanner;

import model.User;
import repository.Repository;

public class UserService {

	/*Dependency Injections*/
	Scanner sc;
	Repository<User> repository = new Repository<>();
	
	
	/*Constructor with parameters*/
	
	public UserService(Scanner sc) {
		this.sc = sc;
	}
}
