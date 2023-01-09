package com.cts.webservices.demo5;

import java.util.List;

public interface CustomerRepository {
	 List<Customer> findByLastName(String lastName);
	  Customer findById(long id);
}
