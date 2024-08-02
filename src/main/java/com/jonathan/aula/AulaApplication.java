package com.jonathan.aula;

import com.jonathan.aula.entities.Order;
import com.jonathan.aula.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Autowired
	OrderService orderService;

	@Override
	public void run(String... args) throws Exception {

		// exemplo 1
		Order order1 = new Order(1034, 150.00, 20.0);
		System.out.printf("\nPedido código " + order1.getCode() + "\n" + "Valor total: R$ %.2f\n\n", orderService.total(order1));

		// exemplo 2
		Order order2 = new Order(2282, 800.00, 10.0);
		System.out.printf("Pedido código " + order2.getCode() + "\n" + "Valor total: R$ %.2f\n\n", orderService.total(order2));

		// exemplo 3
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.printf("Pedido código " + order3.getCode() + "\n" + "Valor total: R$ %.2f", orderService.total(order3));
	}
}
