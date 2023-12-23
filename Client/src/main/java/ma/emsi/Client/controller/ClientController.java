package ma.emsi.Client.controller;

import com.netflix.discovery.converters.Auto;
import ma.emsi.Client.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ma.emsi.Client.repository.clientRepository;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    @Autowired
    private clientRepository repo;

    @GetMapping
    public List<Client> findAll() {
        return repo.findAll();
    }

    @GetMapping("{id}")
    public Client findById(@PathVariable String id) throws Exception {
        return repo.findById(Long.parseLong(id)).orElseThrow(() -> new Exception("Client not found"));

    }
}
