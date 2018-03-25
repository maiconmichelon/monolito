package com.michelon.monolito.Monolito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MonolitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonolitoApplication.class, args);
	}
	
	@GetMapping("servico-1")
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("Serviço 1");
	}

	@GetMapping("servico-2")
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.ok("Serviço 2");
	}
	
	@GetMapping("servico-3")
	public ResponseEntity<String> info() {
		return ResponseEntity.ok("Serviço 3");
	}
	
}
