package com.bakeryandcakes.Alice.and.cakes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceAndCakesApplication implements CommandLineRunner {
	private final CakeBaker cb;

	public AliceAndCakesApplication(Frosting frosting, Syrup syrup){
		this.cb = new CakeBaker(frosting, syrup);
	}


	public static void main(String[] args) {
		SpringApplication.run(AliceAndCakesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cb.bakeCake();
	}
}
