package com.example.test;

import com.example.model.Address;
import com.example.model.Customer;
import com.example.service.CustomerService;
import com.example.service.CustomerServiceImpl;

public class CustomerTest {

	public static void main(String[] args) {

//		Address address = new Address();
//		address.setCity("Ist");
//		address.setRoad("Soganli Cad");
//
//		String phone1 = "05336673366";
//		String phone2 = "05313174433";
//
//		Customer customer = new Customer();
//		customer.setName("SSS Sait");
//		customer.setSurname("Palamut");
//		customer.setEmail("saitpalam@gmail.com");
//		customer.getPhones().add(phone1);
//		customer.getPhones().add(phone2);
//		customer.setAddress(address);
//
//		
//		Address address2 = new Address();
//		address2.setCity("Ankara");
//		address2.setRoad("Yaneimahalle mah.");
//
//		String phone3 = "05348440101";
//
//		Customer customer2 = new Customer();
//		customer2.setName("Mehmet Akif");
//		customer2.setSurname("Palamut");
//		customer2.setEmail("makif@gmail.com");
//		customer2.getPhones().add(phone3);
//		customer2.setAddress(address2);

		
		CustomerService customerService = new CustomerServiceImpl();
//		customerService.create(customer);
//		customerService.create(customer2);
		
//		Customer uCus = customerService.getById(1L);
//		uCus.setName("Ahme Sa");
//		uCus.getAddress().setNo("No:2-4");
//		customerService.update(uCus);
//		
		for (Customer c : customerService.getAll(Customer.class)) {
			System.out.println(c);
		}
		
//		Customer dCus = customerService.getById(2L);
//		if (dCus != null) {
//			customerService.delete(dCus);
//		}
//
//		System.out.println("---------------------------");
//		for (Customer c : customerService.getAll(new Customer())) {
//			System.out.println(c);
//		}
		
	}
	

}
