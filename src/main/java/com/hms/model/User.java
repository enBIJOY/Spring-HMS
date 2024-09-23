package com.hms.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.AssertTrue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mid;
    @Getter
    @Setter
    private String username;
    @Setter
    private String password;
    @Getter
    private String fullName;
    @Getter
    private String phone;
    @Getter
    private int age;
    @Getter
    private String sex;
    private String address;
    private String userType;



    public User(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "User{" +
                "phone='" + phone + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
