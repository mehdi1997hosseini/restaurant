package com.restaurant.baseProject.securitybasic.account;

import com.restaurant.baseProject.entitybasic.EntityBasic;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "TBL_ACCOUNT")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AccountEntity extends EntityBasic<String> implements UserDetails {

    @Column(name = "ACCOUNT_USERNAME")
    private String username;
    @Column(name = "ACCOUNT_PASSWORD")
    private String password;
    @Column(name = "ACCOUNT_ENABLED")
    private Boolean enabled;


    @ElementCollection(targetClass = Roles.class,fetch = FetchType.EAGER)
    @CollectionTable(name = "TBL_ACCOUNT_ROLE",joinColumns = @JoinColumn(name = "ACCOUNT_ROLE_USERNAME",referencedColumnName ="ACCOUNT_USERNAME" ))
    private List<Roles> roles;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
}
