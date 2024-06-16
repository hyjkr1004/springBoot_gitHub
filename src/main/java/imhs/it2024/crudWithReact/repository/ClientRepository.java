package imhs.it2024.crudWithReact.repository;

import imhs.it2024.crudWithReact.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
