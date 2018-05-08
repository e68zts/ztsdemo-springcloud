package xin.colove.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;


@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class ConsumerApplication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate ()  {
        return new  RestTemplate (); 
    }
    
	public static void main(String[] args) {
//	    log.debug("starting.....");log.info("starting.....");log.warn("starting.....");log.error("starting.....");
		SpringApplication.run(ConsumerApplication.class, args);
		
	}
}
