package com.rajan.Maithili_Manor.service;

import com.rajan.Maithili_Manor.entity.Role;
import com.rajan.Maithili_Manor.entity.User;

import java.util.List;

public interface RoleService {

    List<Role> getRoles();
    Role createRole(Role role);
    void deleteRole(Long roleId);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);


}
