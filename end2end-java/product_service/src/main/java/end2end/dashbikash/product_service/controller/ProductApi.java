package end2end.dashbikash.product_service.controller;

import end2end.dashbikash.lib_dao.Product;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import end2end.dashbikash.product_service.service.ProductDBService;

@RestController
@RequestMapping("/api/v1/product")
public class ProductApi {
	@Autowired
	private ProductDBService productDBService;
	
	
	@RequestMapping("/")
	public List<Product> getProduct() {
		return  productDBService.getAllProducts();
	}
	

}
