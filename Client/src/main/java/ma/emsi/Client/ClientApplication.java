package ma.emsi.Client;

import ma.emsi.Client.entity.Client;
import ma.emsi.Client.repository.clientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    CommandLineRunner initialiserBaseH2(clientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client(Long.parseLong("1"), "Badreddine IBZAZNE", Float.parseFloat("29")));
            clientRepository.save(new Client(Long.parseLong("2"), "KHALID ABENAY", Float.parseFloat("27")));
            clientRepository.save(new Client(Long.parseLong("3"), "MED AMINE ELBAZI", Float.parseFloat("27")));

        };
    }


}
