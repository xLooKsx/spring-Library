package pt.personal.Library.service;

import pt.personal.Library.entity.Permission;

import java.util.List;
import java.util.UUID;

public interface PermissionService {
    List<Permission> findAll();
    Permission findById(UUID id);
    Permission save(Permission permission);
    List<Permission> saveAll(List<Permission> permissionList);
}
