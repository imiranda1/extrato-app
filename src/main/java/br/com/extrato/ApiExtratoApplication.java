package br.com.extrato;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication

public class ApiExtratoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiExtratoApplication.class, args);

	}

}
