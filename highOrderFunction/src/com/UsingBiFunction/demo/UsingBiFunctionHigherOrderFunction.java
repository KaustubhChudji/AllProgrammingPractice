package com.UsingBiFunction.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class UsingBiFunctionHigherOrderFunction {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		BiFunction<List<Integer>, Predicate<Integer>, List<Integer>> filter;

		filter = (l, predicate) -> {
			List<Integer> result = new ArrayList<>();
			for (Integer integer : intList) {
				if (predicate.test(integer)) {
					result.add(integer);
				}
			}
			return result;
		};

		System.out.println(filter.apply(intList, x -> x > 5));
	}
}
