package pt.personal.Library.service.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import pt.personal.Library.entity.Permission;
import pt.personal.Library.entity.Roles;
import pt.personal.Library.entity.RolesPermission;
import pt.personal.Library.repository.RolesPermissionRepository;
import pt.personal.Library.service.RolesPermissionService;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class RolesPermissionServiceImplement implements RolesPermissionService {

    @Autowired
    private RolesPermissionRepository rolesPermissionRepository;

    @Override
    public List<RolesPermission> findAll() {
        return rolesPermissionRepository.findAll();
    }

    @Override
    public RolesPermission findById(UUID id) {
        return rolesPermissionRepository.findById(id).get();
    }

    @Override
    public RolesPermission save(RolesPermission rolesPermission) {
        return rolesPermissionRepository.save(rolesPermission);
    }

    @Override
    public List<RolesPermission> saveAll(List<RolesPermission> rolesPermissionList) {
        return rolesPermissionRepository.saveAll(rolesPermissionList);
    }
}
