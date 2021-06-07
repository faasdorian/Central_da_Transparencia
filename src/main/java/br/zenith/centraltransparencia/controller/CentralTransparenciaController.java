package br.zenith.centraltransparencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.zenith.centraltransparencia.entity.City;
import br.zenith.centraltransparencia.entity.Expense;
import br.zenith.centraltransparencia.service.CentralTransparenciaService;

@Controller
public class CentralTransparenciaController {

	@Autowired
	CentralTransparenciaService service;

	@GetMapping("index")
	public ModelAndView getHomePage() {
		return new ModelAndView("index");
	}

	@GetMapping("search")
	public ModelAndView getSearchPage() {
		return new ModelAndView("search");
	}

	@PostMapping("city")
	@ResponseBody
	public ModelAndView getCity(@RequestParam MultiValueMap<String, String> body) {
		ModelAndView view;
		List<Expense> expenses;
		City city = service.getCity(body.getFirst("cityName"));
		if (city == null) {
			view = new ModelAndView("missing");
		} else {
			expenses = service.getAllExpenses(city.getId());
			view = new ModelAndView("city");
			view.addObject("city", city);
			view.addObject("expenses", expenses);
		}

		return view;
	}

}
