package com.api.reservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication()
public class NReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(NReservationApplication.class, args);
	}

}
