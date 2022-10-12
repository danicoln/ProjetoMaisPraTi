package repository;

import model.Student;

public class StudentRepository extends Repository<Student> {

	public Student findForCpf(String cpf) {
		return findAll().stream().filter(a -> a.getCpf().equals(cpf)).findFirst().orElse(null);
	}
}