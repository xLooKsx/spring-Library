package pt.personal.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.personal.Library.entity.Role;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
}