package lab.microservice.forex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForexController {
  
  @Autowired
  private Environment environment;
  
  @Autowired
  private ExchangeValueRepository repository;
  
  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  public ExchangeValue retrieveExchangeValue
    (@PathVariable String from, @PathVariable String to){
    
	 //TODO: use repository to find exchange rate using from and to parameter.
    ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
    
   exchangeValue.setPort(
        Integer.parseInt(environment.getProperty("server.port")));
    
    return exchangeValue;
  }
}
