//package xin.colove.web.controller;
//
//import java.lang.reflect.InvocationTargetException;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.apache.log4j.Logger;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.actuate.metrics.CounterService;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//import com.google.common.collect.Maps;
//
//import lombok.extern.slf4j.Slf4j;
//@Slf4j
////@EnableDiscoveryClient
//@RestController
//public class ConsumerController {
//    
////    @Autowired
////    RestTemplate restTemplate;
//    
////    private  final  Logger  logger = Logger.getLogger(getClass());
//    String url="http://HELLO-SERVICE-IDEA-DEMOIDEA";
//    
//
//    @RequestMapping(value ="/ribbon-consumer",  method =RequestMethod.GET)
//    public  String  helloConsumer  (String name){
//        return "xx";
////        return  restTemplate.getForEntity(url+"/hello?name={1}",String.class,name).getBody();
//    }
//}
