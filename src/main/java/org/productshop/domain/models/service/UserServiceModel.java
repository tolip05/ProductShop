package org.productshop.domain.models.service;

import java.util.HashSet;
import java.util.Set;

public class UserServiceModel extends BaseServiceModel{
    private String username;
    private String password;
    private String email;
    private Set<RoleServiceModel> authorities;

    public UserServiceModel() {
        this.authorities = new HashSet<>();
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<RoleServiceModel> getAuthorities() {
        return this.authorities;
    }

    public void setAuthorities(Set<RoleServiceModel> authorities) {
        this.authorities = authorities;
    }
}
