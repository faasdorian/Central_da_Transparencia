package br.zenith.centraltransparencia.model;

import javax.persistence.*;

@Entity
@Table(name = "EXPENSES")
public class Expense {
	
	@Id
	@Column(name = "EXPENSE_ID")
	private Long expenseId;
	@Column(name = "EXPENSE_VALUE")
	private Double expenseValue;
	@Column(name = "ORGAO")
	private String orgao;
	@Column(name = "EVENTO")
	private String evento;
	@Column(name = "NOME_FORNECEDOR")
	private String nomeFornecedor;
	@Column(name = "DATA_EMISSAO")
	private String dataEmissao;
	@ManyToOne
	@JoinColumn(name = "CITY_ID")
	City city;

	public Expense() {
	}

	public Expense(Double expenseValue, String orgao, String evento, String nomeFornecedor, String dataEmissao) {
		this.expenseValue = expenseValue;
		this.orgao = orgao;
		this.evento = evento;
		this.nomeFornecedor = nomeFornecedor;
		this.dataEmissao = dataEmissao;
	}

	public Long getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(Long expenseId) {
		this.expenseId = expenseId;
	}

	public Double getExpenseValue() {
		return expenseValue;
	}

	public void setExpenseValue(Double value) {
		this.expenseValue = value;
	}

	public String getOrgao() {
		return orgao;
	}

	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Expense{" +
				"expenseId=" + expenseId +
				", expenseValue=" + expenseValue +
				", orgao='" + orgao + '\'' +
				", evento='" + evento + '\'' +
				", nomeFornecedor='" + nomeFornecedor + '\'' +
				", dataEmissao='" + dataEmissao + '\'' +
				", city=" + city +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Expense expense = (Expense) o;

		return expenseId != null ? expenseId.equals(expense.expenseId) : expense.expenseId == null;
	}

	@Override
	public int hashCode() {
		return expenseId != null ? expenseId.hashCode() : 0;
	}
}
