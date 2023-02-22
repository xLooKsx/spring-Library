package pt.personal.Library.service;

import pt.personal.Library.entity.RolesPermission;

import java.util.List;
import java.util.UUID;

public interface RolesPermissionService {
    List<RolesPermission> findAll();
    RolesPermission findById(UUID id);
    RolesPermission save(RolesPermission rolesPermission);
    List<RolesPermission> saveAll(List<RolesPermission> rolesPermissionList);
}
