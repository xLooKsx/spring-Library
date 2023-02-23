package pt.personal.Library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.personal.Library.entity.RolePermission;
import pt.personal.Library.service.RolePermissionService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/rolePermission")
public class RolePermissionController {
    @Autowired
    private RolePermissionService rolePermissionService;

    @PostMapping(path = "/add",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RolePermission> create(@RequestBody RolePermission newRolePermission) {
        RolePermission rolePermission = rolePermissionService.save(newRolePermission);
        if (rolePermission == null) {
            return new ResponseEntity<>(rolePermission, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(rolePermission, HttpStatus.CREATED);
        }
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<RolePermission> getById(@PathVariable UUID id) {
        RolePermission rolePermission = rolePermissionService.findById(id);
        if (rolePermission == null) {
            return new ResponseEntity<>(rolePermission, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(rolePermission, HttpStatus.OK);
        }
    }

    @GetMapping("/list")
    public ResponseEntity<List<RolePermission>> getAll() {
        return new ResponseEntity<>(rolePermissionService.findAll(), HttpStatus.OK);
    }
}
