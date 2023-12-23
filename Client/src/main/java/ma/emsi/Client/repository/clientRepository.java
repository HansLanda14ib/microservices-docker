package ma.emsi.Client.repository;

import ma.emsi.Client.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientRepository extends JpaRepository<Client,Long> {


}
