package br.zenith.centraltransparencia.controller;

import java.util.List;

import br.zenith.centraltransparencia.model.Expense;
import br.zenith.centraltransparencia.service.ExpenseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import br.zenith.centraltransparencia.model.City;
import br.zenith.centraltransparencia.service.CityService;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	CityService cityService;
	ExpenseService expenseService;

	public MainController(CityService cityService, ExpenseService expenseService) {
		this.cityService = cityService;
		this.expenseService = expenseService;
	}

	@GetMapping("index")
	public String getHomePage() {
		return "index";
	}

	@GetMapping("search")
	public String getSearchPage(Model model) {
		List<City> cities = cityService.getAllCities();
		model.addAttribute("cities", cities);
		return "search";
	}

	@PostMapping("city")
	@ResponseBody
	public ModelAndView sendToCityPage(@RequestParam MultiValueMap<String, String> body) {
		return new ModelAndView("redirect:/city/" + body.getFirst("cityId") + "/" + body.getFirst("page"));
	}

	@GetMapping("city/{cityIdInPath}/{pageInPath}")
	public String getCity(Model model, @PathVariable String cityIdInPath, @PathVariable String pageInPath) {
		Long cityId = Long.parseLong(cityIdInPath);
		int page = Integer.parseInt(pageInPath);

		City city = cityService.getCity(cityId);
		List<Expense> expenses = expenseService.getAllExpenses(cityId, page);
		int totalExpenses = expenseService.getTotalExpenses(cityId);
		int numberOfPages = expenseService.getNumberOfPages(cityId);

		if (city == null) {
			return "missing";
		} else {
			model.addAttribute("city", city);
			model.addAttribute("expenses", expenses);
			model.addAttribute("totalExpenses", totalExpenses);
			model.addAttribute("numberOfPages", numberOfPages);
			model.addAttribute("currentPage", page);

			return "city";
		}
	}

}
