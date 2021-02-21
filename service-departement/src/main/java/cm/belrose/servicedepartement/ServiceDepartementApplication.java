package cm.belrose.servicedepartement;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @EnableEurekaClient Active l'enregistrement automatique des paramètres de ce service vers le service d'enregistrement
 * service-eureka-server
 * @OpenAPIDefinition active la génération automatique de la documentation de l'API
 */
@SpringBootApplication
@EnableEurekaClient
@OpenAPIDefinition
public class ServiceDepartementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDepartementApplication.class, args);
	}

}
