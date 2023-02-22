package pt.personal.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.personal.Library.entity.Permission;

import java.util.UUID;

public interface PermissionRepository extends JpaRepository<Permission, UUID> {
}