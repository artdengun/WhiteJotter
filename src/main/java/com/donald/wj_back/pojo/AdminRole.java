package com.donald.wj_back.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "admin_role")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class AdminRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * Role name.
     */
    private String name;

    /**
     * Role name in Chinese.
     */
    @Column(name = "name_zh")
    private String nameZh;

//    /**
//     * Role status.
//     */
//    private boolean enabled;
//
//
//    /**
//     * Transient property for storing permissions owned by current role.
//     */
//    @Transient
//    private List<AdminPermission> perms;
//
//    /**
//     * Transient property for storing menus owned by current role.
//     */
//    @Transient
//    private List<AdminMenu> menus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }
}