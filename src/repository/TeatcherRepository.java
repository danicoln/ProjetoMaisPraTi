package repository;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import model.Teatcher;

public class TeatcherRepository {

private Map<Integer, Teatcher> database;
	
	public TeatcherRepository() {
		this.database = new TreeMap<>();
	}

	/*CRUD*/
	
	public void create(Teatcher teatcher) {
		this.database.put(teatcher.getId(), teatcher);
	}
	
	public List<Teatcher> readAll(){
		return this.database.values().stream().collect(Collectors.toList());
	}
	
	public void update (Teatcher teatcher, Integer id) { // verificar e implementar o metodo update
		this.database.put(id, teatcher);
	}
	
	public void deleteForId(Integer id) {
		this.database.remove(id);
	}
}
