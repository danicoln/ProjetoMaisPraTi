package repository;

import model.Person;

public class PersonRepository extends Repository<Person> {

	public Person findForCpf(String cpf) {
		return findAll().stream().filter(p -> p.getCpf().equals(cpf)).findFirst().orElse(null);
	}
	
	
}
