package br.com.systemsgs.rabbitmq.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.systemsgs.rabbitmq.dto.EstoqueDTO;

@RestController
@RequestMapping(value = "/api/estoque")
public class EstoqueController {
	
	@PutMapping
	public ResponseEntity alteraEstoque(@RequestBody EstoqueDTO estoqueDTO) {
		return new ResponseEntity(HttpStatus.OK);
	}

}
