package br.com.gouvea.springadminmonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpringAdminMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAdminMonitorApplication.class, args);
	}

}
