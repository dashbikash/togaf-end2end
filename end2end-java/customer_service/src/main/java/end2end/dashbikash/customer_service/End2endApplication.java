package end2end.dashbikash.customer_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "end2end.dashbikash.lib_dao")
@EntityScan(basePackages = "end2end.dashbikash.lib_dao")
public class End2endApplication {

	public static void main(String[] args) {
		SpringApplication.run(End2endApplication.class, args);
	}

}
