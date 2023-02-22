package pt.personal.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.personal.Library.entity.RolesPermission;

import java.util.UUID;

public interface RolesPermissionRepository extends JpaRepository<RolesPermission, UUID> {
}