package br.zenith.centraltransparencia.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CITIES")
public class City {
	
	@Id
	@Column(name = "CITY_ID")
	private Long cityId;
	@Column(name = "CITY_NAME")
	private String name;
	@OneToMany
	@JoinColumn(name = "EXPENSE_ID")
	Set<Expense> expenses = new HashSet<>();

	public City() {
	}

	public City(Long cityId, String name) {
		this.cityId = cityId;
		this.name = name;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(Set<Expense> expenses) {
		this.expenses = expenses;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		City city = (City) o;

		return cityId != null ? cityId.equals(city.cityId) : city.cityId == null;
	}

	@Override
	public int hashCode() {
		return cityId != null ? cityId.hashCode() : 0;
	}
}
