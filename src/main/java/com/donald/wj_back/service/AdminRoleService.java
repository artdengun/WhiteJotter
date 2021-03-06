package com.donald.wj_back.service;

import com.donald.wj_back.pojo.AdminRole;

import java.util.List;

/**
 * @author Donald
 * @data 17/05/2020 17:21
 */
public interface AdminRoleService {
    List<AdminRole> listRolesByUser(String username);
    List<AdminRole> list();
    void addOrUpdate(AdminRole adminRole);
    void editRole(AdminRole adminRole);

    AdminRole updateStatus(AdminRole role);

    void deleteRole(Integer id);
}
