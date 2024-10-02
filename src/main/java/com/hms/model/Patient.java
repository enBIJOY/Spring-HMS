package com.hms.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mid;

    private String fullName;
    private int age;
    private String sex;
    private String bedNumber;
    private int contactNumber;
    private String address;
//    private String username;
//    private String password;
}
