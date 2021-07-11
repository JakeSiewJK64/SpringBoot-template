package com.fategrandorder.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import nonapi.io.github.classgraph.json.Id;

@Setter
@Getter
@ToString
@Document(collection = "Users")
public class UserModel {
    @Id
    private String id;

    @Field("UserName")
    private String userName;

    @Field("Role")
    private String roles;

    @Field("PhoneNumber")
    private String phoneNumber;

    @Field("Password")
    private String password;

    @Field("UserEmail")
    private String email;

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", userName='" + getUserName() + "'" + ", roles='" + getRoles() + "'"
                + ", phoneNumber='" + getPhoneNumber() + "'" + ", password='" + getPassword() + "'" + ", email='"
                + getEmail() + "'" + "}";
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoles() {
        return this.roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

}
