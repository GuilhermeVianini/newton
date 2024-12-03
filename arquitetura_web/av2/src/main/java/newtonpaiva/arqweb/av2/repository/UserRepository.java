package newtonpaiva.arqweb.av2.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import newtonpaiva.arqweb.av2.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
