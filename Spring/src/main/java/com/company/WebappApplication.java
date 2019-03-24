package com.company;

import com.company.backend.JDiameterClient;
import com.company.OCS.JDiameterServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebappApplication {

	public static void main(String[] args) {
		JDiameterServer jDiameterServer = new JDiameterServer();
		JDiameterClient jDiameterClient = new JDiameterClient();
		jDiameterServer.startServer();
		jDiameterClient.startClient();


		SpringApplication.run(WebappApplication.class, args);
	}
}