package pt.personal.Library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.personal.Library.entity.Permission;
import pt.personal.Library.service.PermissionService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @PostMapping(path = "/add",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Permission> create(@RequestBody Permission newPermission) {
        Permission permission = permissionService.save(newPermission);
        if (permission == null) {
            return new ResponseEntity<>(permission, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(permission, HttpStatus.CREATED);
        }
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Permission> getById(@PathVariable UUID id) {
        Permission permission = permissionService.findById(id);
        if (permission == null) {
            return new ResponseEntity<>(permission, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(permission, HttpStatus.OK);
        }
    }

    @GetMapping("/list")
    public ResponseEntity<List<Permission>> getAll() {
        return new ResponseEntity<>(permissionService.findAll(), HttpStatus.OK);
    }
}
