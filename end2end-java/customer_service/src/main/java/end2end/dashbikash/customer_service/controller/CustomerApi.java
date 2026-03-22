package end2end.dashbikash.customer_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import end2end.dashbikash.lib_dao.Customer;
import end2end.dashbikash.customer_service.service.CustomerService;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerApi {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public List<Customer> getCustomerList() {
		return  customerService.getAllCustomers();
	}

}
