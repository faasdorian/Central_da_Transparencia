package br.zenith.centraltransparencia.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.zenith.centraltransparencia.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
	
	@Query("SELECT 1 FROM CITIES WHERE CITY_NAME = :name")
	public City findCityByName(@Param("name") String cityName);
	
}
