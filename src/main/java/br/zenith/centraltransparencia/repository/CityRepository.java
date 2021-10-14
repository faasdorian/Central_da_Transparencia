package br.zenith.centraltransparencia.repository;

import br.zenith.centraltransparencia.model.Expense;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.zenith.centraltransparencia.model.City;

import java.util.List;
import java.util.Set;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
	
}
