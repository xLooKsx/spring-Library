package pt.personal.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.personal.Library.entity.Roles;

import java.util.UUID;

public interface RolesRepository extends JpaRepository<Roles, UUID> {
}