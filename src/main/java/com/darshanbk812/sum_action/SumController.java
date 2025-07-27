package com.darshanbk812.sum_action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

	@GetMapping("/sum/{n1}/{n2}")
<<<<<<< HEAD
	public String diff(@PathVariable int n1, @PathVariable int n2) {
=======
	public String sum(@PathVariable int n1, @PathVariable int n2) {
>>>>>>> 5c0626d (changed from sum to diff)
		return "Sum is :"+(n1 + n2);
	}

}
