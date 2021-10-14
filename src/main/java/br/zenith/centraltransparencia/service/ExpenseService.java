package br.zenith.centraltransparencia.service;

import br.zenith.centraltransparencia.model.Expense;
import br.zenith.centraltransparencia.repository.ExpenseRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> getAllExpenses(Long cityId, int page) {
        Pageable pageable = PageRequest.of(page, 10);
        List<Expense> expenses = expenseRepository.getExpensesByCityCityId(cityId, pageable);
        return expenses;
    }

    public int getTotalExpenses(Long cityId) {
        int total = expenseRepository.countAllByCityCityId(cityId);
        return total;
    }

    public int getNumberOfPages(Long cityId) {
        int total = expenseRepository.countAllByCityCityId(cityId);
        return (int) Math.ceil(total/10);
    }

}
