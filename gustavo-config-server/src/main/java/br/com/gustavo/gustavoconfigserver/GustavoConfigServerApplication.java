package br.com.gustavo.gustavoconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GustavoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GustavoConfigServerApplication.class, args);
	}

}
