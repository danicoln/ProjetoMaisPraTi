package repository;

import model.User;

public class UserRepository extends Repository<User> {

	public User findForCpf(String cpf) {
		return findAll().stream().filter(u -> u.getCpf().equals(cpf)).findFirst().orElse(null);
	}

}
