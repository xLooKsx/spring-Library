package pt.personal.Library.service;

import pt.personal.Library.entity.Role;

import java.util.List;
import java.util.UUID;

public interface RoleService {
    List<Role> findAll();
    Role findById(UUID id);
    Role save(Role role);
    List<Role> saveAll(List<Role> roleList);
}
