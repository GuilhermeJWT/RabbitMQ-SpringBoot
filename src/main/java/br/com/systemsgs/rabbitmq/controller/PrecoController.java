package br.com.systemsgs.rabbitmq.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.systemsgs.rabbitmq.dto.PrecoDTO;

@RestController
@RequestMapping(value = "/api/preco")
public class PrecoController {
	
	@PutMapping
	public ResponseEntity alteraPreco(@RequestBody PrecoDTO precoDTO) {
		return new ResponseEntity(HttpStatus.OK);
	}

}
