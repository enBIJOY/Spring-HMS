package com.hms.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//@Getter
//@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mid;
    @Getter
    private String fullName;
    @Getter
    private String username;
    @Getter
    //@Setter
    private String password;
    @Getter
    private String phone;
    @Getter
    private int age;
    @Getter
    private String sex;
    @Getter
    private String address;
    @Getter
    private String patientType;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "fk_Patient_Disease")
    private PatientDisease patientDisease;


 // Getter & Setter has been Uses Explicitly.
 // Because of PatientServiceImpl was unable to get and set


    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "mid=" + mid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", patientType='" + patientType + '\'' +
                '}';
    }
}
