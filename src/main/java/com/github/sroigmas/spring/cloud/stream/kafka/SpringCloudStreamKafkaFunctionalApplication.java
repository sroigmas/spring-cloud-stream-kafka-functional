package com.github.sroigmas.spring.cloud.stream.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.function.StreamBridge;

@SpringBootApplication
public class SpringCloudStreamKafkaFunctionalApplication {

  @Autowired
  private StreamBridge streamBridge;

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudStreamKafkaFunctionalApplication.class, args);
  }

  /*@Bean
  public Function<String, String> functional() {
    return String::toUpperCase;
  }*/

  /*@Bean
  public Consumer<String> functional() {
    return data -> {
      data = data.toUpperCase();
      System.out.println(data);
    };
  }*/

  /*@Bean
  public Consumer<String> functional() {
    return data -> streamBridge.send("functional-out-0", data);
  }*/

  /*@Bean
  public Supplier<String> functional() {
    return () -> "Hola";
  }*/
}
