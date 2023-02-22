package pt.personal.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.personal.Library.entity.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}