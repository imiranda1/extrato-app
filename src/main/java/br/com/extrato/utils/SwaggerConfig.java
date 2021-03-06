package br.com.extrato.utils;

import br.com.extrato.controller.ExtratoController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2
public class SwaggerConfig {


    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Extrato")
                .description("Api respnsável por transformar a informação de um sistema legado")
                .license("")
                .termsOfServiceUrl("")
                .version("1.0.0")
                .contact(new Contact("Icaro Miranda","", "icaromiranda89@gmail.com"))
                .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.extrato"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .apiInfo(apiInfo());

    }

}
