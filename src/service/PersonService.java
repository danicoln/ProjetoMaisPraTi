package service;

import java.util.Scanner;

import model.Person;
import repository.PersonRepository;
import repository.Repository;

public class PersonService {

	Scanner sc;
	PersonRepository personRepository = new PersonRepository();
	Repository<Person> repository = new Repository<>();
	
	
	public PersonService(Scanner sc) {
		this.sc = sc;
	}
	
	public Person findPerson(String cpf) {
		Person person = this.personRepository.findForCpf(cpf);
		person.printData();
		return person;
	}
}
