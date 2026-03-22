package end2end.dashbikash.customer_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import end2end.dashbikash.lib_dao.Customer;
import end2end.dashbikash.lib_dao.CustomerRepo;

@Service
public class CustomerService {
    
	private CustomerRepo customerRepo;
        public CustomerService(CustomerRepo customerRepo){
            this.customerRepo=customerRepo;
            
        }
	
	public List<Customer> getAllCustomers() {
		return customerRepo.findAll();
	}
	
}
