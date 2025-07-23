package com.darshanbk812.sum_action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

	@GetMapping("/diff/{n1}/{n2}")
	public String diff(@PathVariable int n1, @PathVariable int n2) {
		return "Sum is :"+(n1 - n2);
	}

}
