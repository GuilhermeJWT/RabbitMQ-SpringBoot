package br.com.systemsgs.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.systemsgs.rabbitmq.constantes.RabbitMQConstantes;
import br.com.systemsgs.rabbitmq.dto.EstoqueDTO;
import br.com.systemsgs.rabbitmq.service.RabbitMQService;

@RestController
@RequestMapping(value = "/api/estoque")
public class EstoqueController {
	
	@Autowired
	private RabbitMQService rabbitMqService;
	
	@PutMapping
	public ResponseEntity alteraEstoque(@RequestBody EstoqueDTO estoqueDTO) {
		this.rabbitMqService.enviaMensagem(RabbitMQConstantes.FILA_ESTOQUE, estoqueDTO);
		
		return new ResponseEntity(HttpStatus.OK);
	}

}
