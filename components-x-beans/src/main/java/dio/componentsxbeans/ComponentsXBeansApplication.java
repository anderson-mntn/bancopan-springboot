package dio.componentsxbeans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;

@SpringBootApplication
public class ComponentsXBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentsXBeansApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(ConversonJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do CEP: " + response);
		};
	}
	

}
