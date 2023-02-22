package pt.personal.Library.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import pt.personal.Library.service.serviceImplement.PermissionServiceImplement;
import pt.personal.Library.service.serviceImplement.RolesServiceImplement;

import java.util.UUID;

@Entity
@Table(name = "roles_permission")
public class RolesPermission {
    @Id
    private UUID roles_id;

    @NotNull
    @NotBlank
    private UUID permission_id;

    @Transient
    private Roles roles;

    @Transient
    private Permission permission;

    //Getters & Setters
    public UUID getRoles_id() {
        return roles_id;
    }

    public void setRoles_id(UUID roles_id) {
        this.roles_id = roles_id;
    }

    public UUID getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(UUID permission_id) {
        this.permission_id = permission_id;
    }

    public Roles getRoles() {
        roles = new RolesServiceImplement().findById(roles_id);
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Permission getPermission() {
        permission = new PermissionServiceImplement().findById(permission_id);
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
}