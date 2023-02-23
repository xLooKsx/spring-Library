package pt.personal.Library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.personal.Library.entity.Role;
import pt.personal.Library.entity.RolePermission;
import pt.personal.Library.entity.User;
import pt.personal.Library.service.UserService;


@RestController
@RequestMapping("/api")
public class Test {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public ResponseEntity test(){
        return ResponseEntity.ok("Hello World");
    }
}
