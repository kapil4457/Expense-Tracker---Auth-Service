package org.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class UserInfo {

    @Id
    @Column(name="user_id")
    private String userId;

    private String username;
    private String password;

    @ManyToMany(fetch =  FetchType.EAGER)
    @JoinTable(name = "users_role",joinColumns = @JoinColumn(name="user_id"), inverseJoinColumns = @JoinColumn(name="role_id"))
    private Set<UserRole> roles = new HashSet<>();

}
