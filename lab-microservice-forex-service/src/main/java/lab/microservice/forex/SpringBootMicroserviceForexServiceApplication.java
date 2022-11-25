package lab.microservice.forex;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMicroserviceForexServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceForexServiceApplication.class, args);
	}
	
	 @Bean
	  public CommandLineRunner demo(ExchangeValueRepository repository) {
		 return (args) -> {
			 repository.save(new ExchangeValue("USD","THB",35.00));
			 repository.save(new ExchangeValue("EUR","THB", 45.00));
			 repository.save(new ExchangeValue("AUD","THB", 25.00));
			 System.out.println("Initial ExchangeValue are saved");
		 
		 };
		 
	 }

}
