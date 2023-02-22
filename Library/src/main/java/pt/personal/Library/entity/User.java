package pt.personal.Library.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import pt.personal.Library.service.serviceImplement.RolesServiceImplement;

import java.util.UUID;

@Entity
@Table(name = "user")
public class User {
    @Id
    private UUID id = UUID.randomUUID();

    @NotNull
    @NotBlank
    private String first_name;

    @NotNull
    @NotBlank
    private String last_name;

    @NotNull
    @NotBlank
    private String email;

    @NotNull
    @NotBlank
    private UUID role_id;

    @Transient
    private Roles roles;

    //Getters & Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getRole_id() {
        return role_id;
    }

    public void setRole_id(UUID role_id) {
        this.role_id = role_id;
    }

    public Roles getRoles() {
        roles = new RolesServiceImplement().findById(role_id);
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
}