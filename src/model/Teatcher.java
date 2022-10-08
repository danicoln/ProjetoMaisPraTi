package model;

import java.time.LocalDateTime;

public class Teatcher extends Person {


	private Integer id;

	public Teatcher(String name, String phone, String birthDate, LocalDateTime dataCadastroPessoa) {
		super(name, phone, birthDate, dataCadastroPessoa);
	}

	public Integer getId() {
		return id;
	}

}
