package br.com.cesrc.seusuas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal da aplicação Spring Boot Seusuas.
 *
 * Esta classe inicia a aplicação Spring Boot.
 */
@SpringBootApplication
public class SeusuasApplication { 

	/**
	 * Método principal que inicia a aplicação Spring Boot.
	 *
	 * @param args Argumentos da linha de comando passados para a aplicação.
	 */
	public static void main(String[] args) {
		SpringApplication.run(SeusuasApplication.class, args);
	}

}