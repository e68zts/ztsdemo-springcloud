package xin.colove.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

/**
 * ConsumerApplication
 * 
 * @author  zts
 * @version 1.0.0
 */
@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class ColoveWebApplication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate ()  {
        return new  RestTemplate (); 
    }
    
	public static void main(String[] args) {
//	    log.debug("starting.....");log.info("starting.....");log.warn("starting.....");log.error("starting.....");
		SpringApplication.run(ColoveWebApplication.class, args);
		
	}
}
