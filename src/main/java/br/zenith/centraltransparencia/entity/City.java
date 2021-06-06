package br.zenith.centraltransparencia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CITIES")
public class City {
	
	@Id
	@Column(name = "CITY_ID")
	private Integer cityId;
	@Column(name = "CITY_NAME")
	private String name;

	public Integer getId() {
		return cityId;
	}

	public String getName() {
		return name;
	}

	

}
