package com.hms.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "PatientDisease")
public class PatientDisease {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Disease")
    private String diseaseName;
    private  String diseaseType;
}
