package xin.colove.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {

//    @Bean
//    @LoadBalanced
//    RestTemplate restTemplate ()  {
//        return new  RestTemplate (); 
//    }
    
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
