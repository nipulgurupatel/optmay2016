package com.two95.training.chapter7;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		int index = o1.getLastName().compareTo(o2.getLastName());
		return index;
	}

}
