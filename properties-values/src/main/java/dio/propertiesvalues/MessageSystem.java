package dio.propertiesvalues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageSystem implements CommandLineRunner{

    @Value("${nome: Generic name value}")
    private String nome;
    @Value("${email}")
    private String email = "ananap@gmail.com";
    @Value("${telefone}")
    private List<Long> telefone ;

     @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome +
        ", seu email é: " + email + " , seu telefone é: " + telefone
        );
    }
}
