package pt.personal.Library.service.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import pt.personal.Library.entity.User;
import pt.personal.Library.repository.UserRepository;
import pt.personal.Library.service.UserService;

import java.util.List;
import java.util.UUID;

public class UserServiceImplement implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(UUID id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> saveAll(List<User> userList) {
        return userRepository.saveAll(userList);
    }
}
