package net.sf.dsfb.integerlist;

import java.util.*;

public class ListMain {

	public static void main(String[] args) {
		
	}
	
	public int getMax(List<Integer> lista) throws RuntimeException {
		if (lista == null) {
			throw new RuntimeException("Lista é nula!");
		}

		if (lista.isEmpty()) {
			throw new RuntimeException("Lista vazia!");
		}

		return Collections.max(lista);
	}
}
