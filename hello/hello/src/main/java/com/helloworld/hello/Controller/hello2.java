package com.helloworld.hello.Controller;
//objetivos de aprendizagem para
//essa semana.
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/Hello2")

public class hello2 {
	

	@GetMapping
	public String Hello() {
		return "Ajudar os colegas que estão tendo dificuldades, ter foco nas aulas e refazer os exercicios";
	}
	

}
