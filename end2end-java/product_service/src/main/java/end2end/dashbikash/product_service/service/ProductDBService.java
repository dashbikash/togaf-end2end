package end2end.dashbikash.product_service.service;

import end2end.dashbikash.lib_dao.Product;
import end2end.dashbikash.lib_dao.ProductRepo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductDBService {
	
	@Autowired
	private ProductRepo productRepository;
	
	public ProductDBService() {
		super();
	}
	
	
	public List<Product> getAllProducts() {
		// Implement logic to fetch all products from the database
		return productRepository.findAll(); // Placeholder return statement
	}
	
}
