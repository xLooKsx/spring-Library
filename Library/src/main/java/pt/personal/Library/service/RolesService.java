package pt.personal.Library.service;

import pt.personal.Library.entity.Roles;

import java.util.List;
import java.util.UUID;

public interface RolesService {
    List<Roles> findAll();
    Roles findById(UUID id);
    Roles save(Roles roles);
    List<Roles> saveAll(List<Roles> rolesList);
}
