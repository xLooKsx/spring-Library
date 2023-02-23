package pt.personal.Library.service;

import pt.personal.Library.entity.RolePermission;

import java.util.List;
import java.util.UUID;

public interface RolePermissionService {
    List<RolePermission> findAll();
    RolePermission findById(UUID id);
    RolePermission save(RolePermission rolePermission);
    List<RolePermission> saveAll(List<RolePermission> rolePermissionList);
}
