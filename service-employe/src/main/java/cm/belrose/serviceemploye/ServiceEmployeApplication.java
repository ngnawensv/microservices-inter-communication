package cm.belrose.serviceemploye;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
 * @EnableEurekaClient Active l'enregistrement automatique des paramètres de ce service vers le service d'enregistrement
 * service-eureka-server
 * @OpenAPIDefinition active la génération automatique de la documentation de l'API
 */
@SpringBootApplication
@EnableEurekaClient
@OpenAPIDefinition
public class ServiceEmployeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEmployeApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
