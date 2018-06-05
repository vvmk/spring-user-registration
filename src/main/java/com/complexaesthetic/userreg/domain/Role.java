package com.complexaesthetic.userreg.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * project: user-reg
 * package: com.complexaesthetic.userreg.domain
 * author: https://github.com/vvmk
 * date: 6/4/18
 */

@Entity
@Table(name = "Roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
