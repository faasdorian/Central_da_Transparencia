package br.zenith.centraltransparencia.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.zenith.centraltransparencia.entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
	@Query("SELECT * FROM EXPENSES WHERE CITY_ID = :cityId")
	public List<Expense> findAllExpensesByCityId(@Param("cityId") Integer cityId);
}
