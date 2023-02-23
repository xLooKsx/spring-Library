package pt.personal.Library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.personal.Library.entity.Role;
import pt.personal.Library.service.RoleService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping(path = "/add",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Role> create(@RequestBody Role newRole) {
        Role role = roleService.save(newRole);
        if (role == null) {
            return new ResponseEntity<>(role, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(role, HttpStatus.CREATED);
        }
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Role> getById(@PathVariable UUID id) {
        Role permission = roleService.findById(id);
        if (permission == null) {
            return new ResponseEntity<>(permission, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(permission, HttpStatus.OK);
        }
    }

    @GetMapping("/list")
    public ResponseEntity<List<Role>> getAll() {
        return new ResponseEntity<>(roleService.findAll(), HttpStatus.OK);
    }
}
