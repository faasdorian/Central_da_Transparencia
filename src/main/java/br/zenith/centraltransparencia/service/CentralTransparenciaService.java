package br.zenith.centraltransparencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.zenith.centraltransparencia.entity.City;
import br.zenith.centraltransparencia.entity.Expense;
import br.zenith.centraltransparencia.repository.CityRepository;
import br.zenith.centraltransparencia.repository.ExpenseRepository;

@Service
public class CentralTransparenciaService {
	
	@Autowired
	CityRepository cityRepository;
	@Autowired
	ExpenseRepository expenseRepository;

	public City getCity(String cityName) {
		City city = cityRepository.findCityByName(cityName);
		return city;
	}
	
	public List<Expense> getAllExpenses(Integer cityId) {
		List<Expense> expenses = expenseRepository.findAllExpensesByCityId(cityId);
		return expenses;
	}

}
