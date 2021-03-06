package com.donald.wj_back.dao;

import com.donald.wj_back.pojo.AdminMenu;
import com.donald.wj_back.pojo.AdminRoleMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Donald
 * @data 17/05/2020 17:17
 */
public interface AdminRoleMenuDao extends JpaRepository<AdminRoleMenu,Integer> {
    List<AdminRoleMenu> findAllByRidIn(List<Integer> rids);

    List<AdminRoleMenu> findAllByRid(int rid);
    void deleteAllByRid(int rid);
}
