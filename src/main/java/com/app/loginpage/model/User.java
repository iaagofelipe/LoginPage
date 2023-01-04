package com.app.loginpage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loginUser")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User {

    @Id
    private Long id;

    private String name;
    private String email;
    private String user;
    private String password;
    private Boolean firstAccess = true;
}
