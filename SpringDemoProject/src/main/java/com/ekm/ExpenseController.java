package com.ekm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExpenseController {
	@Autowired
    ExpenseRepository repository;
     
	@RequestMapping("/home")
	public String home() {
		try {
			try {
				System.out.println("started");
				/*
				 * repository.save(new Expense("breakfast", 5)); repository.save(new
				 * Expense("coffee", 2)); repository.save(new Expense("New SSD drive", 200));
				 * repository.save(new Expense("Tution for baby", 350)); repository.save(new
				 * Expense("Some apples", 5));
				 * 
				 * Iterable<Expense> iterator = repository.findAll();
				 * 
				 * System.out.println("All expense items: "); iterator.forEach(item ->
				 * System.out.println(item));
				 * 
				 * List<Expense> breakfast = repository.findByItem("breakfast");
				 * System.out.println("\nHow does my breakfast cost?: "); breakfast.forEach(item
				 * -> System.out.println(item));
				 * 
				 * List<Expense> expensiveItems = repository.listItemsWithPriceOver(200);
				 * System.out.println("\nExpensive Items: "); expensiveItems.forEach(item ->
				 * System.out.println(item));
				 */
	        } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("test");	
			return "home";
		} catch (Exception e) {
			e.printStackTrace();
			return "home";
		}
		
	}

}
