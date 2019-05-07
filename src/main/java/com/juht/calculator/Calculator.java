package com.juht.calculator;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;
/** This is calcluator sevice class
    Hongtaek Ju
*/
@Service
public class Calculator {
	@Cacheable
	int sum(int a, int b){
		return a+b;
	}

	@Cacheable
	int dif(int a, int b){
		return a-b;
	}
}
