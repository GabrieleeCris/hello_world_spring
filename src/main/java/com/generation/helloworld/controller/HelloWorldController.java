package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	@GetMapping
	public String helloWordld() {
		return "Hello World!!!";
		// Model (Modelo): Sua responsabilidade é gerenciar e controlar a forma como
		// os dados se comportam por meio das funções, lógica e regras de negócios
		// estabelecidas.

		// Controller (Controladora): A camada de controle é responsável por intermediar
		// as requisições enviadas pelo View com as respostas fornecidas pelo Model,
		// processando os dados que o usuário informou e repassando para outras camadas.

//View (Visão): Essa camada é responsável por apresentar as informações de forma visual ao 
//usuário. Em seu desenvolvimento devem ser aplicados apenas recursos ligados a aparência como
//mensagens, botões ou telas.

	}
}
