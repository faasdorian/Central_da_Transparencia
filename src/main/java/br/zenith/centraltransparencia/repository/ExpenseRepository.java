package br.zenith.centraltransparencia.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.zenith.centraltransparencia.model.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long>, PagingAndSortingRepository<Expense, Long> {

	public List<Expense> getExpensesByCityCityId(Long cityId, Pageable pageable);

	public int countAllByCityCityId(Long cityId);

}
