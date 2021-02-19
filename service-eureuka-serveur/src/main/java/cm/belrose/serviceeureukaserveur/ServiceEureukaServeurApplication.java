package cm.belrose.serviceeureukaserveur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceEureukaServeurApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEureukaServeurApplication.class, args);
	}

}
