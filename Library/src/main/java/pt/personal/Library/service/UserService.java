package pt.personal.Library.service;

import pt.personal.Library.entity.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> findAll();
    User findById(UUID id);
    User save(User user);
    List<User> saveAll(List<User> userList);
}
