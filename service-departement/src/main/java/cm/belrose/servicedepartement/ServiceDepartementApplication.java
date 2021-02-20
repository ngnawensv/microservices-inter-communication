package cm.belrose.servicedepartement;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@OpenAPIDefinition
public class ServiceDepartementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDepartementApplication.class, args);
	}

}
