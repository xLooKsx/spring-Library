package pt.personal.Library.service.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import pt.personal.Library.entity.Roles;
import pt.personal.Library.repository.RolesRepository;
import pt.personal.Library.service.RolesService;

import java.util.List;
import java.util.UUID;

public class RolesServiceImplement implements RolesService {

    @Autowired
    private RolesRepository rolesRepository;

    @Override
    public List<Roles> findAll() {
        return rolesRepository.findAll();
    }

    @Override
    public Roles findById(UUID id) {
        return rolesRepository.findById(id).get();
    }

    @Override
    public Roles save(Roles roles) {
        return rolesRepository.save(roles);
    }

    @Override
    public List<Roles> saveAll(List<Roles> rolesList) {
        return rolesRepository.saveAll(rolesList);
    }
}
