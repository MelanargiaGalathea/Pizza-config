package com.Melanar.pizza;

import com.Melanar.pizza.config.PizzaConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzaApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(PizzaApplication.class);

	PizzaConfig pizzaConfig = new PizzaConfig();

	public PizzaApplication (PizzaConfig pizzaConfig) {
		this.pizzaConfig = pizzaConfig;
	}

	public static void main(String[] args) {
		SpringApplication.run(PizzaApplication.class, args);
	}

	@Override
	public void run(final String... args) {

		log.info(
				String.format("Pizza with %s sauce, %s and %s crust.",
				pizzaConfig.getSauce(),
				pizzaConfig.getTopping(),
				pizzaConfig.getCrust())
		);
	}
}
