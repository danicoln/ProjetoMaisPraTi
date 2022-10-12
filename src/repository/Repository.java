package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Database;

public class Repository<T extends Database> {

	Map<Integer, T> database;

	public Repository() {
		this.database = new HashMap<>();
	}

	public T save(T t) {
		return this.database.put(t.getId(), t);
	}

	public List<T> findAll() {
		return this.database.values().stream().collect(Collectors.toList());
	}

	public T findForId(Integer id) {
		return this.database.get(id);
	}

	public void removeForId(Integer id) {
		this.database.remove(id);
	}

	public T update(T t, Integer id) {
		return this.database.put(id, t);
	}
}
