package cm.belrose.servicecloudgateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCloudGatewayApplication.class, args);
	}

}
