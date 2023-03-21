package dio.primeirospassosspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner{

    @Autowired
    private Calculadora calculadora; // Já não precisamos dar new Calculadora ()

    @Override
    public void run(String... args) throws Exception {
        System.out.println(calculadora.somar(11, 25));
    }
    
}
