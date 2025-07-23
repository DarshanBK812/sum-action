package com.darshanbk812.sum_action;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SumActionApplicationTests {

	@InjectMocks
	private SumController controller;

	@ParameterizedTest
	@CsvSource({ "1 ,2, -1", "5 , 2, 3" })
	void contextLoads(int n1, int n2, int output) {
		assertEquals("Sum is :" + output, controller.diff(n1, n2));
	}
}
