package xin.colove.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;
import xin.colove.web.ColoveWebApplication;

/**
 * demo
 * @author  zts
 * @version 1.0.0
 */
@RestController
@Slf4j
public class ConsumerController {
    
    @Autowired
    RestTemplate restTemplate;
    
    String url="http://HELLO-SERVICE-IDEA-DEMOIDEA";
    
    @RequestMapping(value ="/ribbon-consumer",  method =RequestMethod.GET)
    public  String  helloConsumer  (String name){
        log.info("ribbon-consumer ...method:{}", "get");
        return  restTemplate.getForEntity(url+"/hello?name={1}",String.class,name).getBody();
    }
}
