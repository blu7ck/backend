package com.blu4ck.backend;
//
//import com.blu4ck.backend.run.NightsRequest;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//
//@SpringBootApplication
//public class FuckedUps {
//
//	private static final Logger log = LoggerFactory.getLogger(FuckedUps.class);
//	public static void main(String[] args) {
//		SpringApplication.run(FuckedUps.class, args);
//	}
//@Bean
//CommandLineRunner runner(){
//	return args -> {
//		NightsRequest night = new NightsRequest("bişeyler anlatmışım gibi davranalım", 1);
//        log.info("Night: ", night);
//		};
//
//
//	}
//}

import com.blu4ck.backend.run.Nights;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FuckedUps {

	private static final Logger log = LoggerFactory.getLogger(FuckedUps.class);

	public static void main(String[] args) {
		SpringApplication.run(FuckedUps.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Nights night = new Nights(1, "Bir şeyler anlatmışım gibi davranalım");
			log.info("Night: {}", night);
		};
	}

}


