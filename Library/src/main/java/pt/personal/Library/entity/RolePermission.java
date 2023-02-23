package pt.personal.Library.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import pt.personal.Library.service.serviceImplement.PermissionServiceImplement;
import pt.personal.Library.service.serviceImplement.RoleServiceImplement;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "role_permission")
public class RolePermission {
    @Id
    private UUID role_id;

    @NotNull
    @NotBlank
    private UUID permission_id;

    @Transient
    private Role role;

    @Transient
    private Permission permission;

    //Getters & Setters
    public UUID getRole_id() {
        return role_id;
    }

    public void setRole_id(UUID role_id) {
        this.role_id = role_id;
    }

    public UUID getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(UUID permission_id) {
        this.permission_id = permission_id;
    }

    public Role getRole() {
        role = new RoleServiceImplement().findById(role_id);
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Permission getPermission() {
        permission = new PermissionServiceImplement().findById(permission_id);
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
}