package repository;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import model.Student;

public class StudentRepository {
	
	private Map<Integer, Student> database;
	
	public StudentRepository() {
		this.database = new TreeMap<>();
	}

	/*CRUD*/
	
	public void create(Student student) {
		this.database.put(student.getRegistration(), student);
	}
	
	public List<Student> readAll(){
		return this.database.values().stream().collect(Collectors.toList());
	}
	
	public void update (Student student, Integer id) { // verificar e implementar o metodo update
		this.database.put(id, student);
	}
	
	public void deleteForId(Integer id) {
		this.database.remove(id);
	}
		
}
