package com.helloworld.hello.Controller;
//objetivos de aprendizagem para
//essa semana.
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/Hello")

public class HelloController {
	

	@GetMapping
	public String Hello() {
		return "persistência, trabalho em equipe e atenção ao detalhe";
	}
	

}

