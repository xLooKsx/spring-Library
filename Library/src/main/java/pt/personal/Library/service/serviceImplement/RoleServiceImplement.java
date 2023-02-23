package pt.personal.Library.service.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.personal.Library.entity.Role;
import pt.personal.Library.repository.RoleRepository;
import pt.personal.Library.service.RoleService;

import java.util.List;
import java.util.UUID;

@Service
public class RoleServiceImplement implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(UUID id) {
        return roleRepository.findById(id).get();
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> saveAll(List<Role> roleList) {
        return roleRepository.saveAll(roleList);
    }
}
