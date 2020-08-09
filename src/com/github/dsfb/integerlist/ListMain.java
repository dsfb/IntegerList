package com.github.dsfb.integerlist;

import java.util.*;

public class ListMain {
	public int getMax(List<Integer> lista) throws RuntimeException {
		if (lista == null) {
			throw new RuntimeException("Lista é nula!");
		}

		if (lista.isEmpty()) {
			throw new RuntimeException("Lista vazia!");
		}

		return Collections.max(lista);
	}

	public int getClassicMax(List<Integer> lista) throws RuntimeException {
		if (lista == null) {
			throw new RuntimeException("Lista é nula!");
		}

		if (lista.isEmpty()) {
			throw new RuntimeException("Lista vazia!");
		}

		int result = Integer.MIN_VALUE;
		for (Integer elemento : lista) {
			if (elemento > result) {
				result = elemento;
			}
		}

		return result;
	}

	public double getArithmeticAvg(List<Integer> lista) throws RuntimeException {
		if (lista == null) {
			throw new RuntimeException("Lista é nula!");
		}

		if (lista.isEmpty()) {
			throw new RuntimeException("Lista vazia!");
		}

		double result = 0;

		for (Integer element : lista) {
			result += element;
		}

		return result / lista.size();
	}
}
