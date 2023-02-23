package pt.personal.Library.service.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.personal.Library.entity.Permission;
import pt.personal.Library.repository.PermissionRepository;
import pt.personal.Library.service.PermissionService;

import java.util.List;
import java.util.UUID;

@Service
public class PermissionServiceImplement implements PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public List<Permission> findAll() {
        return permissionRepository.findAll();
    }

    @Override
    public Permission findById(UUID id) {
        return permissionRepository.findById(id).get();
    }

    @Override
    public Permission save(Permission permission) {
        return permissionRepository.save(permission);
    }

    @Override
    public List<Permission> saveAll(List<Permission> permissionList) {
        return permissionRepository.saveAll(permissionList);
    }
}
