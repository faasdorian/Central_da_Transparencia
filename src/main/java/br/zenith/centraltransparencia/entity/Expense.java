package br.zenith.centraltransparencia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EXPENSES")
public class Expense {
	
	@Id
	@Column(name = "EXPENSE_ID")
	private Integer expenseId;
	@Column(name = "CITY_ID")
	private Integer cityId;
	@Column(name = "EXPENSE_NAME")
	private String expenseName;
	@Column(name = "INFO")
    private String info;
	@Column(name = "EXPENSE_VALUE")
    private Double value;
	@Column(name = "IS_CONSISTENT")
    private Integer isConsistent;

	public Integer getId() {
		return expenseId;
	}
	public Integer getCityId() {
		return cityId;
	}
	public String getName() {
		return expenseName;
	}
	public String getInfo() {
		return info;
	}
	public Double getValue() {
		return value;
	}
	public Integer getIsConsistent() {
		return isConsistent;
	}
	
	

}
