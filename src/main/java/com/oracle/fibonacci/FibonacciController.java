package com.oracle.fibonacci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FibonacciController {

	@Autowired
	private FibonacciService fs;

	@RequestMapping("/{length}")
	public fibonacciData sayHi(@PathVariable int length) {

		return fs.getFibonacciResult(length);
	}

}
