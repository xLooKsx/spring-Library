package pt.personal.Library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.personal.Library.entity.User;
import pt.personal.Library.service.UserService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path = "/add",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> create(@RequestBody User newUser) {
        User user = userService.save(newUser);
        if (user == null) {
            return new ResponseEntity<>(user, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<User> getById(@PathVariable UUID id) {
        User user = userService.findById(id);
        if (user == null) {
            return new ResponseEntity<>(user, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
    }

    @GetMapping("/list")
    public ResponseEntity<List<User>> getAll() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }
}
