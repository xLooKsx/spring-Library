package pt.personal.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.personal.Library.entity.RolePermission;

import java.util.UUID;

public interface RolePermissionRepository extends JpaRepository<RolePermission, UUID> {
}