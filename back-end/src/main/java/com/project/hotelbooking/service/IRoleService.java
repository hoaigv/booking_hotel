package com.project.hotelbooking.service;

import com.project.hotelbooking.model.Role;
import com.project.hotelbooking.model.User;

import java.util.List;



public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}
