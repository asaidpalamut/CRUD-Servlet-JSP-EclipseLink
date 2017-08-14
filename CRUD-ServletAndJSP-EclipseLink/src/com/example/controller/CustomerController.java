package com.example.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.Address;
import com.example.model.Customer;
import com.example.service.CustomerService;
import com.example.service.CustomerServiceImpl;

@WebServlet("/customerContr")
public class CustomerController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static String INSERT_OR_EDIT = "/customer.jsp";
	private static String LIST_CUSTOMER = "/listCustomer.jsp";

	private CustomerService customerService;

	public CustomerController() {
		super();
		customerService = new CustomerServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String forward = "";
		String action = request.getParameter("action");

		if (action.equals("delete")) {
			Long customerId = Long.parseLong(request.getParameter("customerId"));
			Customer customer = customerService.getById(customerId);
			if (customer != null) {
				customerService.delete(customer);
				forward = LIST_CUSTOMER;
				request.setAttribute("customers", customerService.getAll(Customer.class));
			}

		}
		else if (action.equals("edit")) {
			forward = INSERT_OR_EDIT;
			Long customerId = Long.parseLong(request.getParameter("customerId"));
			Customer customer = customerService.getById(customerId);
			request.setAttribute("customer", customer);
		}
		else if (action.equals("listCustomer")) {
			forward = LIST_CUSTOMER;
			request.setAttribute("customers", customerService.getAll(Customer.class));
		}
		else {
			forward = INSERT_OR_EDIT;
		}

		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Address address = new Address();
		Customer customer = new Customer();

		customer.setName(request.getParameter("name"));
		customer.setSurname(request.getParameter("surname"));
		customer.setEmail(request.getParameter("email"));
		customer.getPhones().add(request.getParameter("phone1"));
		customer.getPhones().add(request.getParameter("phone2"));
		address.setRoad(request.getParameter("road"));
		address.setStreet(request.getParameter("street"));
		address.setNo(request.getParameter("no"));
		address.setZip(request.getParameter("zip"));
		address.setCity(request.getParameter("city"));
		customer.setAddress(address);
		
		String customerId = request.getParameter("customerId");
		if (customerId == null || customerId.isEmpty()) {
			customerService.create(customer);
		} 
		else {
			customer.setId(Long.parseLong(customerId));
			customerService.update(customer);
		}
		
		RequestDispatcher view = request.getRequestDispatcher(LIST_CUSTOMER);
		request.setAttribute("customers", customerService.getAll(Customer.class));
		view.forward(request, response);
	}

}
