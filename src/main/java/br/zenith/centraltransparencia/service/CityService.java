package br.zenith.centraltransparencia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.zenith.centraltransparencia.model.City;
import br.zenith.centraltransparencia.repository.CityRepository;

@Service
public class CityService {

	CityRepository cityRepository;

	public CityService(CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}

	public City getCity(long id) {
		City city = cityRepository.findById(id).orElse(null);
		return city;
	}

	public List<City> getAllCities() {
		List<City> cities = (List<City>) cityRepository.findAll();
		return cities;
	}
}
