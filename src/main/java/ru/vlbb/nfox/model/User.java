package ru.vlbb.nfox.model;

import java.util.Date;
import java.util.Set;

public class User extends AbstractNamedEntity {

    private String email;

    private String password;

    private boolean enabled;

    private Date registered = new Date();

    private Set<Role> roles;

    public User(Integer id, String name, String email, String password) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.roles.add(Role.USER);
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Date getRegistered() {
        return registered;
    }

    public Set<Role> getRoles() {
        return roles;
    }
}
