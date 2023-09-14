package ru.vlbb.nfox.model;

import java.util.Date;
import java.util.Set;

public class User extends AbstractNamedEntity {

    private String email;

    private String password;

    private boolean enabled;

    private Date registered = new Date();

    private Set<UserRole> userRoles;

    public User(Integer id, String name, String email, String password) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.userRoles.add(UserRole.USER);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public Set<UserRole> getRoles() {
        return userRoles;
    }

    public void setRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
