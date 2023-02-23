package pt.personal.Library.service.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.personal.Library.entity.RolePermission;
import pt.personal.Library.repository.RolePermissionRepository;
import pt.personal.Library.service.RolePermissionService;

import java.util.List;
import java.util.UUID;

@Service
public class RolePermissionServiceImplement implements RolePermissionService {

    @Autowired
    private RolePermissionRepository rolePermissionRepository;

    @Override
    public List<RolePermission> findAll() {
        return rolePermissionRepository.findAll();
    }

    @Override
    public RolePermission findById(UUID id) {
        return rolePermissionRepository.findById(id).get();
    }

    @Override
    public RolePermission save(RolePermission rolePermission) {
        return rolePermissionRepository.save(rolePermission);
    }

    @Override
    public List<RolePermission> saveAll(List<RolePermission> rolePermissionList) {
        return rolePermissionRepository.saveAll(rolePermissionList);
    }
}
