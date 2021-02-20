package cm.belrose.servicedepartement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceDepartementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDepartementApplication.class, args);
	}

}
