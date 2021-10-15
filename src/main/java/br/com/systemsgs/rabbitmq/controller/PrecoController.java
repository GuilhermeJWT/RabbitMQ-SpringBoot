package br.com.systemsgs.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.systemsgs.rabbitmq.constantes.RabbitMQConstantes;
import br.com.systemsgs.rabbitmq.dto.PrecoDTO;
import br.com.systemsgs.rabbitmq.service.RabbitMQService;

@RestController
@RequestMapping(value = "/api/preco")
public class PrecoController {
	
	@Autowired
	private RabbitMQService rabbitMqService;
	
	@PutMapping
	public ResponseEntity alteraPreco(@RequestBody PrecoDTO precoDTO) {
		this.rabbitMqService.enviaMensagem(RabbitMQConstantes.FILA_PRECO, precoDTO);
		return new ResponseEntity(HttpStatus.OK);
	}

}
