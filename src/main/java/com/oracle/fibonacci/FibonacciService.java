package com.oracle.fibonacci;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.oracle.fibonacci.exceptions.invalidInputException;

@Service
public class FibonacciService {

	List<Integer> sequenceList;
	int sum;
	fibonacciData fd = new fibonacciData();

	public fibonacciData getFibonacciResult(int length) {

		if(length < 2)
		{
			System.out.println(1);
			throw new invalidInputException("Length was less than 1");
		}
		sequenceList = new ArrayList<Integer>();
		sum =0;
		for (int i = 0; i < length; i++) {

			sequenceList.add(fib(i));
			sum = sum + fib(i);

		}
		fd.setTotal(sum);
		fd.setSequence(sequenceList);
		fd.setMemberCount(length);

		return fd;

	}

	private int fib(int n) {
		if (n <= 1)
			return n;

		// Recursive call
		return fib(n - 1) + fib(n - 2);
	}

}
