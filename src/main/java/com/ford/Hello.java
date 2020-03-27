package com.ford;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class Hello {

	@GetMapping
	public ResponseEntity<String> find() {
		return ResponseEntity.ok().body("Teste Ford");
	}

}
