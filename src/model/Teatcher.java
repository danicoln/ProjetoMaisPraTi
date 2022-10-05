package model;

import java.time.LocalDateTime;

public class Teatcher extends Person {

	public Teatcher(String name, String phone, String birthDate, LocalDateTime dataCadastroPessoa) {
		super(name, phone, birthDate, dataCadastroPessoa);
	}

	private Integer id;

	public Integer getId() {
		return id;
	}

}
