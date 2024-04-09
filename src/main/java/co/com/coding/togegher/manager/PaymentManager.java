package co.com.coding.togegher.manager;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Component
public class PaymentManager implements IPaymentManager {


    private RestTemplate restTemplate;

    public PaymentManager(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String processPayment() throws Exception {
        try {
            restTemplate.getForEntity("https://www.google.com", String.class);
            return "Pago procesado correctamente";
        } catch (Exception ex) {
            throw ex;
        }


    }
}
